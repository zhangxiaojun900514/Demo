package com.android.retrofitdemo;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;

public class GitHubClient {
	private static ServiceInterface getInterfaceInstance() {
		RestAdapter restAdapter = new RestAdapter.Builder().setServer(
				Constants.getBaseUrl()).build();

		// Create an instance of our GitHub API interface.
		ServiceInterface github = restAdapter.create(ServiceInterface.class);
		return github;
	}
	
	public static void getContributors(Callback<List<Contributor>> callback) {
		// Create a very simple REST adapter which points the GitHub API
		// endpoint.
		ServiceInterface github = getInterfaceInstance();

		// Fetch and print a list of the contributors to this library.
		github.contributors("square", "retrofit", callback);

	}
	
}
