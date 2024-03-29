/*
 * Copyright 2022. the original author or authors
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
 */

package group.idealworld.dew.core.basic.utils.convert;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.ObjectUtils;

import java.time.Instant;

/**
 * Instant convert.
 *
 * @author gudaoxuri
 */
public class InstantConvert implements Converter<String, Instant> {
    @Override
    public Instant convert(String str) {
        if (ObjectUtils.isEmpty(str)) {
            return null;
        }
        return Instant.ofEpochMilli(Long.valueOf(str));
    }
}
