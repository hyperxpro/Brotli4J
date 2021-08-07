/*
 * This file is part of Brotli4j.
 * Copyright (c) 2020-2021 Aayush Atharva
 *
 * Brotli4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Brotli4j is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Brotli4j.  If not, see <https://www.gnu.org/licenses/>.
 */
/* Copyright 2018 Google Inc. All Rights Reserved.

   Distributed under MIT license.
   See file LICENSE for detail or copy at https://opensource.org/licenses/MIT
*/

package com.aayushatharva.brotli4j.encoder;

import java.nio.ByteBuffer;

/**
 * Prepared dictionary data provider.
 */
public interface PreparedDictionary {
    ByteBuffer getData();
}
