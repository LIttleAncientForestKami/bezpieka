package pl.lafk.bezpieka.kod;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.*;
import java.util.Hashtable;

/**
 * Example of LDAP injection, taken from a book.
 *
 * @see file LDAP.ldif (LDAP Data Interchange Format)
 * @author Java Coding Guidelines: 75 recommendations for reliable and secure programs
 */
// String userSN = "S*"; // Invalid
// String userPassword = "*"; // Invalid
public class LDAPInjection {

    private void searchRecord(String userSN, String userPassword)
            throws NamingException {
        Hashtable<String, String>  env =
                new Hashtable<String, String>();
        env.put(Context.INITIAL_CONTEXT_FACTORY,
                "com.sun.jndi.ldap.LdapCtxFactory");
        try {
            DirContext dctx = new InitialDirContext(env);
            SearchControls sc = new SearchControls();
            String[] attributeFilter = {"cn", "mail"};
            sc.setReturningAttributes(attributeFilter);
            sc.setSearchScope(SearchControls.SUBTREE_SCOPE);
            String base = "dc=example,dc=com";

//TODO: tutaj patrz
            // The following resolves to (&(sn=S*)(userPassword=*))
            String filter = "(&(sn=" + userSN + ")(userPassword=" +
                    userPassword + "))";

            NamingEnumeration<?> results =
                    dctx.search(base, filter, sc);
            while (results.hasMore()) {
                SearchResult sr = (SearchResult) results.next();
                Attributes attrs = (Attributes) sr.getAttributes();
                Attribute attr = (Attribute) attrs.get("cn");
                System.out.println(attr);
                attr = (Attribute) attrs.get("mail");
                System.out.println(attr);
            }
            dctx.close();
        } catch (NamingException e) {
            // Forward to handler
        }
    }

    private void theRightWay() {
        String userSN = "Sherlock Holmes"; // Valid
        String userPassword = "secret2";   // Valid
// ... beginning of LDAPInjection.searchRecord() ...
        SearchControls sc = new SearchControls();
        sc.setSearchScope(SearchControls.SUBTREE_SCOPE);
        String base = "dc=example,dc=com";

//TODO: tutaj biała lista osiągana regexem
        // użytkownik ma tylko litery i białe znaki
        // hasło ma tylko znaki alfanumeryczne
        if (!userSN.matches("[\\w\\s]*") ||
                !userPassword.matches("[\\w]*")) {
            throw new IllegalArgumentException("Invalid input");
        }
        String filter = "(&(sn = " + userSN + ")(userPassword=" +
                userPassword + "))";
    }
}