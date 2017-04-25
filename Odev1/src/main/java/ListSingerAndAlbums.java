import java.util.ArrayList;

/**
 * Created by Can on 23.4.2017.
 */
public class ListSingerAndAlbums {

    //Singers
    public  ArrayList<String> KattyPerry = new ArrayList<String>();
    public  ArrayList<String> Rihanna = new ArrayList<String>();
    public  ArrayList<String> JenniferLopez = new ArrayList<String>();

    //ŞARKICILARI LİSTELİYOR
    public void SingersAndSingersList(){

        KattyPerry.add("\"kattyperry\"");
        Rihanna.add("\"rihanna\"");
        JenniferLopez.add("\"jenniferlopez \"");
        for(int i = 0; i<1; i++){
            System.out.println(KattyPerry.get(i) + "\n"  + Rihanna.get(i) + "\n"  + JenniferLopez.get(i));
        }
    }

    public boolean ContainsSinger(String input) {
        ListSingersAlbums();
        if (input == null){
            return false;
        }
        return KattyPerry.contains(input.toLowerCase());
    }

    //ALBÜM VE ŞARKICILARI LİSTELİYOR
    public void ListSingersAlbums(){

        KattyPerry.add("\"kattyperry\"");
        KattyPerry.add("rise");
        KattyPerry.add("roar");
        KattyPerry.add("birthday");
        //   for(int i =0; i<KattyPerry.size(); i++){
        //      System.out.println(KattyPerry.get(i));
        //  }
        Rihanna.add("\"rihanna\"");
        Rihanna.add("umbrella");
        Rihanna.add("stay");
        Rihanna.add("work");
        // for(int i =0; i<Rihanna.size(); i++){
        //    System.out.println(Rihanna.get(i));
        //  }

        JenniferLopez.add("\"jenniferlopez\"");
        JenniferLopez.add("papi");
        JenniferLopez.add("booty");
        JenniferLopez.add("danceagain");
        // for(int i =0; i<JenniferLopez.size(); i++){
        //   System.out.println(JenniferLopez.get(i));
        //}
    }

    //KattyPery Albümünde ARama Yapma
    public boolean KattyPerryContainsAlbums(String input) {
        ListSingersAlbums();
        if (input == null){
            return false;
        }
        return KattyPerry.contains(input.toLowerCase());
    }
    //Rihanna Albümünde ARama Yapma
    public boolean RihannaContainsAlbums(String input) {
        ListSingersAlbums();
        if (input == null){
            return false;
        }
        return Rihanna.contains(input.toLowerCase());
    }
    //JenniferLopez Albümünde ARama Yapma
    public boolean JenniferLopezContainsAlbums(String input) {
        ListSingersAlbums();
        if (input == null){
            return false;
        }
        return JenniferLopez.contains(input.toLowerCase());
    }



}
