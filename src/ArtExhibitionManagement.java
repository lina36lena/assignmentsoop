public class ArtExhibitionManagement {
    //атрибуты
    private String artwork,artist,author;
    //конструктор
    public ArtExhibitionManagement(String artwork,String artist,String author){
        this.artwork=artwork;this.artist=artist;this.author=author;
    }
    //методы getter и setter
    //getter
    public String getArtwork(){return artwork;}
    public String getArtist(){return artist;}
    public String getAuthor(){return author;}

    //setter
    public void setArtwork(String artwork){this.artwork=artwork;}
    public void setArtist(String artist){this.artist=artist;}
    public void setAuthor(String author){this.author=author;}
    @Override
    public String toString() {return "Artwork: " + artwork + ", Artist: " + artist + ", Author: " + author;}

}


