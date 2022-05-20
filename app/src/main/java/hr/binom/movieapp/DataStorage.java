package hr.binom.movieapp;

import java.util.Arrays;
import java.util.List;

import hr.binom.movieapp.db.Movie;

/**
 * Created by Marin on 11.05.2022..
 */

public class DataStorage {

   public static final List<Movie> MOVIES = Arrays.asList(
           new Movie(
                   1L,
                   "Shawshank Redemption",
                   "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",
                   "https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_FMjpg_UX1000_.jpg",
                   "https://www.imdb.com/title/tt0111161",
                   9.2
           ),
           new Movie(
                   2L,
                   "The Godfather",
                   "The aging patriarch of an organized crime dynasty in postwar New York City transfers control of his clandestine empire to his reluctant youngest son.",
                   "https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_FMjpg_UX1000_.jpg",
                   "https://www.imdb.com/title/tt0068646",
                   9.2
           ),
           new Movie(
                   3L,
                   "The Dark Knight",
                   "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.",
                   "https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_FMjpg_UX1000_.jpg",
                   "https://www.imdb.com/title/tt0468569",
                   9.0
           ),
           new Movie(
                   4L,
                   "The Godfather: Part II",
                   "The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.",
                   "https://m.media-amazon.com/images/M/MV5BMWMwMGQzZTItY2JlNC00OWZiLWIyMDctNDk2ZDQ2YjRjMWQ0XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg",
                   "https://www.imdb.com/title/tt0071562",
                   9.0
           ),
           new Movie(
                   5L,
                   "12 Angry Men",
                   "The jury in a New York City murder trial is frustrated by a single member whose skeptical caution forces them to more carefully consider the evidence before jumping to a hasty verdict.",
                   "https://m.media-amazon.com/images/M/MV5BMWU4N2FjNzYtNTVkNC00NzQ0LTg0MjAtYTJlMjFhNGUxZDFmXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_FMjpg_UX1000_.jpg",
                   "https://www.imdb.com/title/tt0050083",
                   8.9
           ),
           new Movie(
                   6L,
                   "Schindler's List",
                   "In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.",
                   "https://m.media-amazon.com/images/M/MV5BNDE4OTMxMTctNmRhYy00NWE2LTg3YzItYTk3M2UwOTU5Njg4XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_.jpg",
                   "https://www.imdb.com/title/tt0108052",
                   8.9
           ),
           new Movie(
                   7L,
                   "The Lord of the Rings: The Return of the King",
                   "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.",
                   "https://m.media-amazon.com/images/M/MV5BNzA5ZDNlZWMtM2NhNS00NDJjLTk4NDItYTRmY2EwMWZlMTY3XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_FMjpg_UX1000_.jpg",
                   "https://www.imdb.com/title/tt0167260",
                   8.9
           ),
           new Movie(
                   8L,
                   "Pulp Fiction",
                   "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.",
                   "https://m.media-amazon.com/images/M/MV5BNGNhMDIzZTUtNTBlZi00MTRlLWFjM2ItYzViMjE3YzI5MjljXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_FMjpg_UX1000_.jpg",
                   "https://www.imdb.com/title/tt0110912",
                   8.9
           ),
           new Movie(
                   9L,
                   "The Lord of the Rings: The Fellowship of the Ring",
                   "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.",
                   "https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_FMjpg_UX1000_.jpg",
                   "https://www.imdb.com/title/tt0120737",
                   8.8
           ),
           new Movie(
                   10L,
                   " The Good, the Bad and the Ugly",
                   "A bounty hunting scam joins two men in an uneasy alliance against a third in a race to find a fortune in gold buried in a remote cemetery.",
                   "https://m.media-amazon.com/images/M/MV5BNjJlYmNkZGItM2NhYy00MjlmLTk5NmQtNjg1NmM2ODU4OTMwXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_.jpg",
                   "https://www.imdb.com/title/tt0060196",
                   8.8
           )
   );
}
