/**
 *    Copyright 2016 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.qbe.sql;

import java.util.Optional;

public abstract class AbstractSqlSupport {
    public static final SqlTable UNKNOWN_TABLE = SqlTable.of("<<unknown>>"); //$NON-NLS-1$

    private SqlTable table;

    public AbstractSqlSupport(SqlTable table) {
        this.table = table;
    }

    public Optional<SqlTable> table() {
        return Optional.ofNullable(table);
    }
}