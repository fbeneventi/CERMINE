/**
 * This file is part of CERMINE project.
 * Copyright (c) 2011-2013 ICM-UW
 *
 * CERMINE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * CERMINE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with CERMINE. If not, see <http://www.gnu.org/licenses/>.
 */
package pl.edu.icm.cermine.parsing.tools;

import java.util.List;
import pl.edu.icm.cermine.parsing.model.Token;

/**
 * Text tokenizer.
 *
 * @author Bartosz Tarnawski
 * @param <T> token type
 */
public interface TextTokenizer<T extends Token<?>> {

    /**
     * @param text
     * @return list of tokens, a sequence of atomic parts of the text
     */
    List<T> tokenize(String text);
}
