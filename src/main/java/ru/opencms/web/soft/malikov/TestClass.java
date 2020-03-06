package ru.opencms.web.soft.malikov;

import org.opencms.file.CmsObject;
import org.opencms.file.CmsProperty;
import org.opencms.file.CmsResource;
import org.opencms.jsp.CmsJspActionElement;
import org.opencms.main.CmsException;

public class TestClass {
    public String getInfoFromProperty(String propName, CmsResource resource, CmsJspActionElement cms) throws CmsException {
        String result = "";
        boolean search = true;
        CmsObject cmso = cms.getCmsObject();
        CmsProperty prop = cmso.readPropertyObject(propName, "NavUlClass", search);
        result = (prop != null) ? prop.getValue() : null;
        return result;
    }
}
