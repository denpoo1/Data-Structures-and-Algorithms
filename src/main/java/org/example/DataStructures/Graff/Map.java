package org.example.DataStructures.Graff;

public class Map {
    public static Graph graph = new Graph();
    /**This code defines a Map class with a public static Graph object called 'graph'.
    The createGraff() method of the Map class adds vertices and edges to the Graph object.

    The code first creates 100 vertices, each representing a different city around the world,
    and adds them to the Graph object using the Graph.addVertex() method.

    After creating all the vertices, the code then adds 250 edges between the vertices,
    each with a different distance value, using the Graph.addEdge() method.

    This code seems to be creating a world map with cities and distances between them represented as a graph,
    and may be used for path-finding or route optimization algorithms.*/

    public static void createGraff() {
        Graph.addVertex("Christchurch");
        Graph.addVertex("Split");
        Graph.addVertex("Leeds");
        Graph.addVertex("Gdansk");
        Graph.addVertex("Valencia");
        Graph.addVertex("Lausanne");
        Graph.addVertex("Ghent");
        Graph.addVertex("Cardiff");
        Graph.addVertex("Galway");
        Graph.addVertex("Varanasi");
        Graph.addVertex("Xi'an");
        Graph.addVertex("Manchester");
        Graph.addVertex("Bologna");
        Graph.addVertex("Charleston");
        Graph.addVertex("Bilbao");
        Graph.addVertex("Adelaide");
        Graph.addVertex("Helsinki");
        Graph.addVertex("Aberdeen");
        Graph.addVertex("Innsbruck");
        Graph.addVertex("Nice");
        Graph.addVertex("Graz");
        Graph.addVertex("St. Petersburg");
        Graph.addVertex("Strasbourg");
        Graph.addVertex("Lyon");
        Graph.addVertex("Cork");
        Graph.addVertex("Brisbane");
        Graph.addVertex("Lviv");
        Graph.addVertex("Tbilisi");
        Graph.addVertex("Bogota");
        Graph.addVertex("Tallinn");
        Graph.addVertex("Doha");
        Graph.addVertex("Nuremberg");
        Graph.addVertex("Salzburg");
        Graph.addVertex("Naples");
        Graph.addVertex("Portland");
        Graph.addVertex("Antwerp");
        Graph.addVertex("San Diego");
        Graph.addVertex("Reykjavik");
        Graph.addVertex("Valencia");
        Graph.addVertex("Riga");
        Graph.addVertex("New Orleans");
        Graph.addVertex("Santiago");
        Graph.addVertex("Dubrovnik");
        Graph.addVertex("Hamburg");
        Graph.addVertex("Abu Dhabi");
        Graph.addVertex("Buenos Aires");
        Graph.addVertex("Florence");
        Graph.addVertex("Kyoto");
        Graph.addVertex("Montreal");
        Graph.addVertex("Houston");
        Graph.addVertex("Marseille");
        Graph.addVertex("Krakow");
        Graph.addVertex("Brasília");
        Graph.addVertex("Wellington");
        Graph.addVertex("Johannesburg");
        Graph.addVertex("Kiev");
        Graph.addVertex("Marrakech");
        Graph.addVertex("Taipei");
        Graph.addVertex("Stockholm");
        Graph.addVertex("Oslo");
        Graph.addVertex("Cape Town");
        Graph.addVertex("Dublin");
        Graph.addVertex("Helsinki");
        Graph.addVertex("Zurich");
        Graph.addVertex("Vancouver");
        Graph.addVertex("Edinburgh");
        Graph.addVertex("Lisbon");
        Graph.addVertex("Budapest");
        Graph.addVertex("Warsaw");
        Graph.addVertex("Copenhagen");
        Graph.addVertex("Beijing");
        Graph.addVertex("Athens");
        Graph.addVertex("Prague");
        Graph.addVertex("Mumbai");
        Graph.addVertex("Vienna");
        Graph.addVertex("Melbourne");
        Graph.addVertex("Barcelona");
        Graph.addVertex("Seoul");
        Graph.addVertex("Miami");
        Graph.addVertex("Kuala Lumpur");
        Graph.addVertex("San Francisco");
        Graph.addVertex("Bangkok");
        Graph.addVertex("Amsterdam");
        Graph.addVertex("Istanbul");
        Graph.addVertex("Toronto");
        Graph.addVertex("Madrid");
        Graph.addVertex("Berlin");
        Graph.addVertex("Singapore");
        Graph.addVertex("Dubai");
        Graph.addVertex("Shanghai");
        Graph.addVertex("Rome");
        Graph.addVertex("Moscow");
        Graph.addVertex("Rio de Janeiro");
        Graph.addVertex("Hong Kong");
        Graph.addVertex("Sydney");
        Graph.addVertex("Los Angeles");
        Graph.addVertex("Tokyo");
        Graph.addVertex("Paris");
        Graph.addVertex("New York");
        Graph.addVertex("London");

        Graph.addEdge(72, 92, 481);
        Graph.addEdge(46, 33, 383);
        Graph.addEdge(90, 2, 191);
        Graph.addEdge(69, 50, 105);
        Graph.addEdge(79, 75, 375);
        Graph.addEdge(40, 35, 468);
        Graph.addEdge(83, 2, 178);
        Graph.addEdge(45, 100, 415);
        Graph.addEdge(64, 75, 294);
        Graph.addEdge(52, 25, 425);
        Graph.addEdge(79, 60, 57);
        Graph.addEdge(47, 2, 104);
        Graph.addEdge(53, 97, 157);
        Graph.addEdge(100, 27, 481);
        Graph.addEdge(95, 20, 360);
        Graph.addEdge(21, 94, 225);
        Graph.addEdge(80, 21, 120);
        Graph.addEdge(37, 63, 244);
        Graph.addEdge(54, 82, 413);
        Graph.addEdge(34, 36, 232);
        Graph.addEdge(7, 61, 307);
        Graph.addEdge(56, 20, 302);
        Graph.addEdge(91, 95, 258);
        Graph.addEdge(50, 65, 190);
        Graph.addEdge(9, 37, 451);
        Graph.addEdge(9, 23, 123);
        Graph.addEdge(85, 37, 495);
        Graph.addEdge(95, 52, 483);
        Graph.addEdge(25, 28, 223);
        Graph.addEdge(47, 20, 106);
        Graph.addEdge(49, 95, 499);
        Graph.addEdge(97, 56, 305);
        Graph.addEdge(41, 61, 451);
        Graph.addEdge(5, 92, 496);
        Graph.addEdge(85, 15, 16);
        Graph.addEdge(72, 36, 87);
        Graph.addEdge(58, 50, 70);
        Graph.addEdge(36, 59, 72);
        Graph.addEdge(6, 52, 347);
        Graph.addEdge(84, 27, 354);
        Graph.addEdge(5, 74, 95);
        Graph.addEdge(69, 48, 206);
        Graph.addEdge(54, 13, 168);
        Graph.addEdge(93, 88, 397);
        Graph.addEdge(89, 32, 184);
        Graph.addEdge(63, 42, 431);
        Graph.addEdge(71, 7, 255);
        Graph.addEdge(32, 35, 379);
        Graph.addEdge(80, 75, 426);
        Graph.addEdge(48, 80, 147);
        Graph.addEdge(29, 8, 96);
        Graph.addEdge(95, 34, 207);
        Graph.addEdge(7, 60, 336);
        Graph.addEdge(3, 79, 239);
        Graph.addEdge(51, 79, 98);
        Graph.addEdge(92, 49, 43);
        Graph.addEdge(35, 16, 163);
        Graph.addEdge(9, 25, 77);
        Graph.addEdge(4, 100, 16);
        Graph.addEdge(10, 85, 174);
        Graph.addEdge(65, 71, 290);
        Graph.addEdge(27, 18, 405);
        Graph.addEdge(72, 74, 265);
        Graph.addEdge(73, 90, 28);
        Graph.addEdge(21, 31, 382);
        Graph.addEdge(90, 30, 304);
        Graph.addEdge(8, 25, 193);
        Graph.addEdge(25, 71, 443);
        Graph.addEdge(55, 32, 27);
        Graph.addEdge(71, 43, 288);
        Graph.addEdge(96, 72, 399);
        Graph.addEdge(47, 90, 396);
        Graph.addEdge(94, 26, 266);
        Graph.addEdge(55, 52, 263);
        Graph.addEdge(82, 35, 500);
        Graph.addEdge(76, 100, 191);
        Graph.addEdge(34, 45, 405);
        Graph.addEdge(50, 42, 480);
        Graph.addEdge(40, 56, 376);
        Graph.addEdge(95, 69, 116);
        Graph.addEdge(44, 16, 36);
        Graph.addEdge(10, 95, 112);
        Graph.addEdge(29, 56, 210);
        Graph.addEdge(34, 98, 412);
        Graph.addEdge(31, 67, 20);
        Graph.addEdge(73, 83, 138);
        Graph.addEdge(65, 75, 60);
        Graph.addEdge(29, 74, 447);
        Graph.addEdge(64, 42, 468);
        Graph.addEdge(100, 56, 52);
        Graph.addEdge(21, 5, 341);
        Graph.addEdge(40, 25, 72);
        Graph.addEdge(31, 57, 319);
        Graph.addEdge(70, 12, 329);
        Graph.addEdge(3, 99, 318);
        Graph.addEdge(96, 8, 475);
        Graph.addEdge(17, 35, 2);
        Graph.addEdge(17, 11, 4);
        Graph.addEdge(65, 12, 183);
        Graph.addEdge(4, 35, 223);
        Graph.addEdge(72, 17, 9);
        Graph.addEdge(48, 84, 197);
        Graph.addEdge(53, 17, 415);
        Graph.addEdge(10, 15, 47);
        Graph.addEdge(63, 88, 142);
        Graph.addEdge(87, 89, 220);
        Graph.addEdge(56, 43, 471);
        Graph.addEdge(56, 62, 415);
        Graph.addEdge(96, 59, 409);
        Graph.addEdge(14, 79, 301);
        Graph.addEdge(32, 38, 497);
        Graph.addEdge(90, 37, 487);
        Graph.addEdge(31, 58, 138);
        Graph.addEdge(42, 77, 117);
        Graph.addEdge(2, 71, 451);
        Graph.addEdge(87, 50, 48);
        Graph.addEdge(16, 84, 219);
        Graph.addEdge(32, 1, 314);
        Graph.addEdge(63, 14, 72);
        Graph.addEdge(37, 43, 74);
        Graph.addEdge(68, 10, 143);
        Graph.addEdge(94, 74, 433);
        Graph.addEdge(78, 54, 214);
        Graph.addEdge(69, 83, 401);
        Graph.addEdge(27, 7, 151);
        Graph.addEdge(79, 61, 71);
        Graph.addEdge(38, 61, 48);
        Graph.addEdge(78, 4, 175);
        Graph.addEdge(33, 89, 222);
        Graph.addEdge(42, 2, 16);
        Graph.addEdge(75, 14, 114);
        Graph.addEdge(14, 96, 193);
        Graph.addEdge(12, 44, 418);
        Graph.addEdge(82, 44, 300);
        Graph.addEdge(70, 56, 73);
        Graph.addEdge(78, 84, 313);
        Graph.addEdge(85, 75, 423);
        Graph.addEdge(75, 48, 110);
        Graph.addEdge(5, 2, 144);
        Graph.addEdge(96, 89, 202);
        Graph.addEdge(64, 28, 185);
        Graph.addEdge(97, 13, 480);
        Graph.addEdge(61, 49, 213);
        Graph.addEdge(17, 56, 140);
        Graph.addEdge(86, 13, 398);
        Graph.addEdge(45, 75, 309);
        Graph.addEdge(96, 100, 236);
        Graph.addEdge(4, 70, 46);
        Graph.addEdge(2, 24, 178);
        Graph.addEdge(15, 21, 276);
        Graph.addEdge(31, 30, 356);
        Graph.addEdge(17, 87, 264);
        Graph.addEdge(39, 16, 405);
        Graph.addEdge(44, 62, 453);
        Graph.addEdge(15, 37, 339);
        Graph.addEdge(24, 29, 199);
        Graph.addEdge(35, 57, 217);
        Graph.addEdge(87, 72, 248);
        Graph.addEdge(16, 93, 149);
        Graph.addEdge(14, 24, 58);
        Graph.addEdge(1, 11, 473);
        Graph.addEdge(89, 88, 109);
        Graph.addEdge(81, 69, 282);
        Graph.addEdge(51, 42, 76);
        Graph.addEdge(74, 52, 35);
        Graph.addEdge(57, 54, 398);
        Graph.addEdge(18, 24, 192);
        Graph.addEdge(30, 58, 266);
        Graph.addEdge(59, 81, 360);
        Graph.addEdge(40, 62, 166);
        Graph.addEdge(54, 15, 369);
        Graph.addEdge(93, 43, 311);
        Graph.addEdge(87, 90, 179);
        Graph.addEdge(38, 41, 193);
        Graph.addEdge(49, 93, 490);
        Graph.addEdge(45, 9, 334);
        Graph.addEdge(20, 21, 225);
        Graph.addEdge(23, 99, 82);
        Graph.addEdge(67, 98, 248);
        Graph.addEdge(64, 89, 157);
        Graph.addEdge(7, 53, 40);
        Graph.addEdge(95, 19, 124);
        Graph.addEdge(68, 49, 239);
        Graph.addEdge(22, 8, 139);
        Graph.addEdge(53, 71, 146);
        Graph.addEdge(63, 13, 135);
        Graph.addEdge(39, 11, 474);
        Graph.addEdge(50, 48, 443);
        Graph.addEdge(96, 34, 498);
        Graph.addEdge(73, 89, 35);
        Graph.addEdge(69, 34, 184);
        Graph.addEdge(81, 37, 173);
        Graph.addEdge(12, 43, 275);
        Graph.addEdge(47, 49, 24);
        Graph.addEdge(44, 93, 491);
        Graph.addEdge(70, 13, 464);
        Graph.addEdge(57, 9, 290);
        Graph.addEdge(89, 15, 47);
        Graph.addEdge(9, 96, 31);
        Graph.addEdge(82, 1, 323);
        Graph.addEdge(24, 20, 258);
        Graph.addEdge(32, 2, 477);
        Graph.addEdge(11, 73, 276);
        Graph.addEdge(75, 76, 180);
        Graph.addEdge(90, 89, 444);
        Graph.addEdge(32, 58, 167);
        Graph.addEdge(73, 81, 267);
        Graph.addEdge(90, 31, 104);
        Graph.addEdge(86, 78, 238);
        Graph.addEdge(97, 90, 392);
        Graph.addEdge(49, 7, 385);
        Graph.addEdge(45, 80, 493);
        Graph.addEdge(58, 42, 494);
        Graph.addEdge(74, 31, 51);
        Graph.addEdge(61, 87, 163);
        Graph.addEdge(13, 8, 208);
        Graph.addEdge(82, 23, 448);
        Graph.addEdge(66, 54, 437);
        Graph.addEdge(29, 3, 116);
        Graph.addEdge(87, 30, 396);
        Graph.addEdge(94, 95, 266);
        Graph.addEdge(42, 4, 333);
        Graph.addEdge(80, 70, 60);
        Graph.addEdge(76, 34, 420);
        Graph.addEdge(52, 73, 455);
        Graph.addEdge(71, 88, 338);
        Graph.addEdge(3, 67, 331);
        Graph.addEdge(41, 39, 55);
        Graph.addEdge(91, 99, 127);
        Graph.addEdge(79, 90, 14);
        Graph.addEdge(61, 45, 41);
        Graph.addEdge(1, 43, 122);
        Graph.addEdge(73, 16, 399);
        Graph.addEdge(28, 61, 402);
        Graph.addEdge(53, 58, 166);
        Graph.addEdge(88, 69, 192);
        Graph.addEdge(28, 55, 377);
        Graph.addEdge(83, 25, 342);
        Graph.addEdge(80, 38, 222);
        Graph.addEdge(3, 70, 488);
        Graph.addEdge(31, 36, 436);
        Graph.addEdge(9, 36, 115);
        Graph.addEdge(81, 5, 488);
        Graph.addEdge(93, 14, 345);
        Graph.addEdge(86, 29, 295);
        Graph.addEdge(28, 47, 21);
        Graph.addEdge(49, 86, 211);
        Graph.addEdge(45, 4, 334);
        Graph.addEdge(42, 80, 202);
        Graph.addEdge(95, 80, 295);
    }
}
