package br.com.gobots.network;

import br.com.gobots.domain.TrackList;
import br.com.gobots.enums.TrackGenre;
import br.com.gobots.exception.NetworkException;

public interface TrackListNetwork {

	/**
	 * Getting a list of tracks based on a music genre
	 *
	 * @param genre the music genre
	 * @return a {@link TrackList} object with the tracks
	 * @throws NetworkException whenever something went wrong while calling the
	 *                          Spotify API
	 */
	TrackList suggestTracksForGenre(TrackGenre genre) throws NetworkException;

}
