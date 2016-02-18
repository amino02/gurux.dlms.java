//
// --------------------------------------------------------------------------
//  Gurux Ltd
// 
//
//
// Filename:        $HeadURL$
//
// Version:         $Revision$,
//                  $Date$
//                  $Author$
//
// Copyright (c) Gurux Ltd
//
//---------------------------------------------------------------------------
//
//  DESCRIPTION
//
// This file is a part of Gurux Device Framework.
//
// Gurux Device Framework is Open Source software; you can redistribute it
// and/or modify it under the terms of the GNU General Public License 
// as published by the Free Software Foundation; version 2 of the License.
// Gurux Device Framework is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of 
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
// See the GNU General Public License for more details.
//
// More information of Gurux products: http://www.gurux.org
//
// This code is licensed under the GNU General Public License v2. 
// Full text may be retrieved at http://www.gnu.org/licenses/gpl-2.0.txt
//---------------------------------------------------------------------------

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gurux.dlms.objects;

import gurux.dlms.enums.ObjectType;

public class GXDLMSPushObject {
    private ObjectType type;
    private String logicalName;
    private int attributeIndex;
    private int dataIndex;

    public final ObjectType getType() {
        return type;
    }

    public final void setType(final ObjectType value) {
        type = value;
    }

    public final String getLogicalName() {
        return logicalName;
    }

    public final void setLogicalName(final String value) {
        logicalName = value;
    }

    public final int getAttributeIndex() {
        return attributeIndex;
    }

    public final void setAttributeIndex(final int value) {
        attributeIndex = value;
    }

    public final int getDataIndex() {
        return dataIndex;
    }

    public final void setDataIndex(final int value) {
        dataIndex = value;
    }
}