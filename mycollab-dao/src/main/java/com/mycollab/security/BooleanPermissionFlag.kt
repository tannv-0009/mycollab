/**
 * mycollab-dao - Parent pom providing dependency and plugin management for applications
		built with Maven
 * Copyright © ${project.inceptionYear} MyCollab (support@mycollab.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.security

import com.mycollab.common.i18n.SecurityI18nEnum

/**
 * Boolean permission flag
 *
 * @author MyCollab Ltd
 * @version 1.0
 */
class BooleanPermissionFlag : PermissionFlag() {
    companion object {
        @JvmField val TRUE = 128

        @JvmField val FALSE = 129

        /**
         * Check whether `flag` is true permission
         *
         * @param flag
         * @return
         */
        fun beTrue(flag: Int?): Boolean {
            return flag == TRUE
        }

        /**
         * Check whether `flag` is false permission
         *
         * @param flag
         * @return
         */
        fun beFalse(flag: Int?): Boolean {
            return flag == FALSE
        }

        fun toKey(flag: Int?): SecurityI18nEnum {
            return if (flag == TRUE) SecurityI18nEnum.YES else SecurityI18nEnum.NO
        }
    }
}