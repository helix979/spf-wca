/*
 * Copyright 2017 Carnegie Mellon University Silicon Valley
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

package wcanalysis.heuristic;

/**
 * @author Kasper Luckow
 */
public class HeuristicStatistics {
  public long unresolvedChoices = 0;
  public long resolvedPerfectChoices = 0;
  public long resolvedHistoryChoices = 0;
  public long resolvedInvariantChoices = 0;
  public long newChoices = 0;
}
