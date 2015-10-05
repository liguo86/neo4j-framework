/*
 * Copyright (c) 2015 GraphAware
 *
 * This file is part of GraphAware.
 *
 * GraphAware is free software: you can redistribute it and/or modify it under the terms of
 * the GNU General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details. You should have received a copy of
 * the GNU General Public License along with this program.  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package com.graphaware.runtime.module.thirdparty;

import java.io.Serializable;

/**
 * Representation of a database write operation.
 *
 * @param <T> type of the object that provides details about the operation.
 */
public interface WriteOperation<T> extends Serializable {

    enum OperationType {
        NODE_CREATED,
        NODE_UPDATED,
        NODE_DELETED,
        RELATIONSHIP_CREATED,
        RELATIONSHIP_UPDATED,
        RELATIONSHIP_DELETED
    }

    /**
     * @return type of the operation. Never <code>null</code>.
     */
    OperationType getType();

    /**
     * @return details about the object the operation was performed on.
     */
    T getDetails();
}
