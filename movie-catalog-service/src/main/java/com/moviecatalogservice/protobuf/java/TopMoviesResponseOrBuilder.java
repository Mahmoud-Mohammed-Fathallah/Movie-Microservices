package com.moviecatalogservice.protobuf.java;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trendingmovies.proto

public interface TopMoviesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TopMoviesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Movie movies = 1;</code>
   */
  java.util.List<Movie> 
      getMoviesList();
  /**
   * <code>repeated .Movie movies = 1;</code>
   */
  Movie getMovies(int index);
  /**
   * <code>repeated .Movie movies = 1;</code>
   */
  int getMoviesCount();
  /**
   * <code>repeated .Movie movies = 1;</code>
   */
  java.util.List<? extends MovieOrBuilder> 
      getMoviesOrBuilderList();
  /**
   * <code>repeated .Movie movies = 1;</code>
   */
  MovieOrBuilder getMoviesOrBuilder(
      int index);
}
