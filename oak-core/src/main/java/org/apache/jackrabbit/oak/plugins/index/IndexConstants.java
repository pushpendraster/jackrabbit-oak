/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jackrabbit.oak.plugins.index;

/**
 * TODO document
 */
public interface IndexConstants {

    String INDEX_DEFINITIONS_NODE_TYPE = "oak:queryIndexDefinition";

    String INDEX_DEFINITIONS_NAME = "oak:index";

    String TYPE_PROPERTY_NAME = "type";

    String TYPE_UNKNOWN = "unknown";

    String REINDEX_PROPERTY_NAME = "reindex";

    /**
     * Marks a unique property index.
     */
    String UNIQUE_PROPERTY_NAME = "unique";

    /**
     * Defines the names of the properties that are covered by a specific
     * property index definition.
     */
    String PROPERTY_NAMES = "propertyNames";
}
