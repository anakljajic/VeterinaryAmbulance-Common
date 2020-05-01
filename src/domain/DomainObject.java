/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;

/**
 *
 * @author anakl
 */
public interface DomainObject {

    public String getTableName();

    public String getAttributeNamesForInsert();

    public String getAttributeValuesForInsert();

    public boolean isAutoincrement();

    public void setObjectId(Long id);

    public String getAttributeNamesForUpdate();

    public Long getObjectIDValue();

    public String getObjectIDName();

}
