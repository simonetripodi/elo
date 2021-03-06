package org.nnsoft.trudeau.elo;

/*
 *   Copyright 2013 The Trudeau Project
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

/**
 * The player rank
 * 
 * @param <P> the player's type
 */
public interface PlayersRank<P>
{

    /**
     * Returns the ranking for the player
     * @param player the player
     * @return Returns the ranking for the player
     */
    Double getRanking( P player );

    /**
     * Update the ranking for the player
     * @param player the player 
     * @param ranking the ranking value
     */
    void updateRanking( P player, Double ranking );

}
