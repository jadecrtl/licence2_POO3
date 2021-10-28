public class Test {
    public static void main(String[] args) {
        Spationef u1 = new Navette();
        Navette u2 = new NavetteDiscovery();
        Propulsion u3 = new NavetteDiscovery();
        NavetteRusse u4 = new NavetteDiscovery();
        Spationef u5 = new NavetteRusse();
        SatelliteMeteo u6= new SatelliteMeteo();

        System.out.println(u2.equipageMax());
        System.out.println(u3.equipageMax());
        System.out.println(u5.equipageMax());
        System.out.println(u6.equipageMax());
        System.out.println(u2.typeSpationef());
        System.out.println(((NavetteAmericaine)u2).typeSpationef());
    }
}
