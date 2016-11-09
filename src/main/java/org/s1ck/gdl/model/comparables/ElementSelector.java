/*
 * This file is part of GDL.
 *
 * GDL is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * GDL is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with GDL.  If not, see <http://www.gnu.org/licenses/>.
 */


package org.s1ck.gdl.model.comparables;

/**
 * Used to compare elements (by id)
 */
public class ElementSelector implements ComparableExpression {

  /**
   * Variable which identifies the element
   */
  private String variable;

  public ElementSelector(String variable) {
    this.variable = variable;
  }

  @Override
  public String variables() {
    return this.variable;
  }

  @Override
  public String toString() {
    return variable;
  }
}
