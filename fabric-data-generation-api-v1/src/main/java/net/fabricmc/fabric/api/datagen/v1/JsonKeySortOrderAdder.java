/*
 * Copyright (c) 2016, 2017, 2018, 2019 FabricMC
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

package net.fabricmc.fabric.api.datagen.v1;

/**
 * Provides a way to add keys and priorities for sorting them in generated files.
 */
@FunctionalInterface
public interface JsonKeySortOrderAdder {
	/**
	 * Adds a key with a priority for sorting.
	 * @param key The key to compare.
	 * @param priority The priority for this key. Lower numbers appear before ones with higher numbers. The default priority is 2.
	 */
	void add(String key, int priority);
}
