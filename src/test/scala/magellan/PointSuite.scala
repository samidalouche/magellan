/**
 * Copyright 2015 Ram Sriharsha
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package magellan

import org.scalatest.FunSuite

class PointSuite extends FunSuite {

  test("touches") {
    val point = new Point(0.0, 0.0)
    assert(!point.touches(point))
  }

  test("intersects") {
    val point = new Point(0.0, 0.0)
    assert(point.intersects(point))
  }

  test("buffer") {
    val point = new Point(0.0, 0.0)
    assert(point.buffer(1.0).contains(new Point(0.5, 0.5)))
  }
}
