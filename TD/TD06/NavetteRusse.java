public class NavetteRusse extends Navette {
    public String typeSpationef() {
        return "navette spatiale russe";
    }
    public int equipageMax() {
        return 0; //en effet : il s'agissaitde la premiere
                  //a etre totalement automatisee
    }

    public String typePropulsion() {
        return "par portage, puis ergol liquide";
    }
}
