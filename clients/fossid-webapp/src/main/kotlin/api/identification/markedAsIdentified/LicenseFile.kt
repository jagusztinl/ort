/*
 * Copyright (C) 2020 Bosch.IO GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 * License-Filename: LICENSE
 */

package org.ossreviewtoolkit.fossid.api.identification.markedAsIdentified

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

import org.ossreviewtoolkit.fossid.api.IntBooleanDeserializer

data class LicenseFile(
    val licenseIdentifier: String?,

    @JsonDeserialize(using = IntBooleanDeserializer::class)
    val licenseIncludeInReport: Boolean?,

    @JsonDeserialize(using = IntBooleanDeserializer::class)
    val licenseIsCopyleft: Boolean?,

    @JsonDeserialize(using = IntBooleanDeserializer::class)
    val licenseIsFoss: Boolean?,

    @JsonDeserialize(using = IntBooleanDeserializer::class)
    val licenseIsSpdxStandard: Boolean?,

    val licenseName: String?
)
