public class Main {
    //output them to console, compare multiple objects
    public static void main(String[] args) {
        ArtExhibitionManagement art1 =new ArtExhibitionManagement  ("Allegory of the Planets and Continents", "Giovanni Battista Tiepolo", "The Met Collection");
        ArtExhibitionManagement art2 = new ArtExhibitionManagement ("Allegory of Government: Wisdom Defeating Discord", "Jacob de Wit Dutch", "The Met Collection");

        System.out.println(art1);
        System.out.println(art2);

        System.out.println(
                art1.getArtist().equals(art2.getArtist()) ? "Same artist" : "Different artists"
        );

    }
}


