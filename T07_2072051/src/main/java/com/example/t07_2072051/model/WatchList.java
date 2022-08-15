package com.example.t07_2072051.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class WatchList {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idWatchList")
    private Integer idWatchList;
    @Basic
    @Column(name = "LastWatch")
    private Integer lastWatch;
    @Basic
    @Column(name = "Favorite")
    private Byte favorite;
    @Basic
    @Column(name = "Movie_idMovie")
    private Integer movieIdMovie;
    @Basic
    @Column(name = "User_idUser")
    private Integer userIdUser;

    public Integer getIdWatchList() {
        return idWatchList;
    }

    public void setIdWatchList(Integer idWatchList) {
        this.idWatchList = idWatchList;
    }

    public Integer getLastWatch() {
        return lastWatch;
    }

    public void setLastWatch(Integer lastWatch) {
        this.lastWatch = lastWatch;
    }

    public Byte getFavorite() {
        return favorite;
    }

    public void setFavorite(Byte favorite) {
        this.favorite = favorite;
    }

    public Integer getMovieIdMovie() {
        return movieIdMovie;
    }

    public void setMovieIdMovie(Integer movieIdMovie) {
        this.movieIdMovie = movieIdMovie;
    }

    public Integer getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(Integer userIdUser) {
        this.userIdUser = userIdUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WatchList watchList = (WatchList) o;
        return idWatchList == watchList.idWatchList && movieIdMovie == watchList.movieIdMovie && userIdUser == watchList.userIdUser && Objects.equals(lastWatch, watchList.lastWatch) && Objects.equals(favorite, watchList.favorite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idWatchList, lastWatch, favorite, movieIdMovie, userIdUser);
    }
}
