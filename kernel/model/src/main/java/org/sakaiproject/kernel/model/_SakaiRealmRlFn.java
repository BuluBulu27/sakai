package org.sakaiproject.kernel.model;

/** Class _SakaiRealmRlFn was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _SakaiRealmRlFn extends org.apache.cayenne.CayenneDataObject {

    public static final String TO_SAKAI_REALM_PROPERTY = "toSakaiRealm";
    public static final String TO_SAKAI_REALM_FUNCTION_PROPERTY = "toSakaiRealmFunction";
    public static final String TO_SAKAI_REALM_ROLE_PROPERTY = "toSakaiRealmRole";

    public static final String FUNCTION_KEY_PK_COLUMN = "FUNCTION_KEY";
    public static final String REALM_KEY_PK_COLUMN = "REALM_KEY";
    public static final String ROLE_KEY_PK_COLUMN = "ROLE_KEY";

    public void setToSakaiRealm(org.sakaiproject.kernel.db.model.SakaiRealm toSakaiRealm) {
        setToOneTarget("toSakaiRealm", toSakaiRealm, true);
    }

    public org.sakaiproject.kernel.db.model.SakaiRealm getToSakaiRealm() {
        return (org.sakaiproject.kernel.db.model.SakaiRealm)readProperty("toSakaiRealm");
    } 
    
    
    public void setToSakaiRealmFunction(org.sakaiproject.kernel.db.model.SakaiRealmFunction toSakaiRealmFunction) {
        setToOneTarget("toSakaiRealmFunction", toSakaiRealmFunction, true);
    }

    public org.sakaiproject.kernel.db.model.SakaiRealmFunction getToSakaiRealmFunction() {
        return (org.sakaiproject.kernel.db.model.SakaiRealmFunction)readProperty("toSakaiRealmFunction");
    } 
    
    
    public void setToSakaiRealmRole(org.sakaiproject.kernel.db.model.SakaiRealmRole toSakaiRealmRole) {
        setToOneTarget("toSakaiRealmRole", toSakaiRealmRole, true);
    }

    public org.sakaiproject.kernel.db.model.SakaiRealmRole getToSakaiRealmRole() {
        return (org.sakaiproject.kernel.db.model.SakaiRealmRole)readProperty("toSakaiRealmRole");
    } 
    
    
}
