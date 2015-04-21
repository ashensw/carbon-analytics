/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.analytics.restapi.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * This bean class represents the drill down information to perform drilldown operations
 * (search and count)
 */
@XmlRootElement(name = "drillDownInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class DrillDownRequestBean {

    @XmlElement(name = "tableName")
    private String tableName;
    @XmlElement(name = "categories")
    private List<DrillDownPathBean> categories;
    @XmlElement(name = "language", required = false, defaultValue = "lucene")
    private String language;
    @XmlElement(name = "query")
    private String query;
    @XmlElement(name = "scoreFunction", required = false)
    private String scoreFunction;
    @XmlElement(name = "recordCount", required = false, defaultValue = "10")
    private int recordCount;
    @XmlElement(name = "categoryCount", required = false, defaultValue = "10")
    private int categoryCount;
    @XmlElement(name = "recordStart", required = false, defaultValue = "0")
    private  int recordStart;
    @XmlElement(name = "categoryStart", required = false, defaultValue = "0")
    private  int categoryStart;
    @XmlElement(name = "includeIds", required = false, defaultValue = "false")
    private boolean includeIds;
    @XmlElement(name = "ranges", required = false)
    private List<DrillDownRangeBean> ranges;
    @XmlElement(name = "rangeField", required = false)
    private String rangeField;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<DrillDownPathBean> getCategories() {
        return categories;
    }

    public void setCategories(List<DrillDownPathBean> categories) {
        this.categories = categories;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getScoreFunction() {
        return scoreFunction;
    }

    public void setScoreFunction(String scoreFunction) {
        this.scoreFunction = scoreFunction;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public int getCategoryCount() {
        return categoryCount;
    }

    public void setCategoryCount(int categoryCount) {
        this.categoryCount = categoryCount;
    }

    public int getRecordStart() {
        return recordStart;
    }

    public void setRecordStart(int recordStart) {
        this.recordStart = recordStart;
    }

    public boolean isIncludeIds() {
        return includeIds;
    }

    public void setIncludeIds(boolean includeIds) {
        this.includeIds = includeIds;
    }

    public int getCategoryStart() {
        return categoryStart;
    }

    public void setCategoryStart(int categoryStart) {
        this.categoryStart = categoryStart;
    }

    public List<DrillDownRangeBean> getRanges() {
        return ranges;
    }

    public void setRanges(List<DrillDownRangeBean> ranges) {
        this.ranges = ranges;
    }

    public String getRangeField() {
        return rangeField;
    }

    public void setRangeField(String rangeField) {
        this.rangeField = rangeField;
    }
}
