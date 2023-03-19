package com.example.flowergallery.data;

import com.example.flowergallery.R;

import java.util.ArrayList;

public class FlowerData {

    public FlowerData(){
        loadFlowerData();
        loadFlowerInfo();
        loadFlowerViewingSeason();
        loadFavoriteFlowers();
    }

    ArrayList<Integer> flowerList = new ArrayList<Integer>();

    ArrayList<String> flowerNames = new ArrayList<String>();

    ArrayList<String> flowerInfo = new ArrayList<String>();

    ArrayList<Favorite> favoriteFlowers = new ArrayList<Favorite>();

    ArrayList<String> flowerViewingSeason = new ArrayList<>();

    public void loadFlowerData(){
        flowerList.add(R.drawable.cherryblossom);
        flowerList.add(R.drawable.dahlia);
        flowerList.add(R.drawable.daisy);
        flowerList.add(R.drawable.geranium);
        flowerList.add(R.drawable.gerbera);
        flowerList.add(R.drawable.lotus);
        flowerList.add(R.drawable.peony);
        flowerList.add(R.drawable.poppy);
        flowerList.add(R.drawable.rose);
        flowerList.add(R.drawable.sunflower);

        flowerNames.add("Cherry Blossom");
        flowerNames.add("Dahlia");
        flowerNames.add("Daisy");
        flowerNames.add("Geranium");
        flowerNames.add("Gerbera");
        flowerNames.add("Lotus");
        flowerNames.add("Peony");
        flowerNames.add("Poppy");
        flowerNames.add("Rose");
        flowerNames.add("Sun Flower");
    }

    public void loadFlowerInfo(){
        flowerInfo.add("A cherry blossom, also known as Japanese cherry or sakura, is a flower of " +
                "many trees of genus Prunus or Prunus subg. Cerasus. They are common species in East Asia, " +
                "including China, Korea and especially in Japan. They generally refer to ornamental " +
                "cherry trees, not to be confused with cherry trees that produce fruit for eating. " +
                "It is considered the national flower of Japan.\n" +
                "\n" +
                "Wild species of the cherry tree is widely distributed mainly in the Northern hemisphere." +
                " In the mainstream classification in Europe and North America, cherry trees for " +
                "ornamental purposes are classified into the genus Prunus which consists of about 400 species." +
                " In the mainstream classification in Japan, China, and Russia, on the other hand, " +
                "ornamental cherry trees are classified into the genus Cerasus, which consists of about " +
                "100 species separated from the genus Prunus, and the genus Cerasus does not include " +
                "Prunus salicina, Prunus persica (Peach), Prunus mume, Prunus grayana, amongst others. " +
                "In Europe and North America, however, there were not many wild cherry trees with many " +
                "large flowers suitable for cherry blossom viewing.");
        flowerInfo.add("Dahlia is a genus of bushy, tuberous, herbaceous perennial plants native to Mexico " +
                "and Central America. A member of the Asteraceae (former name: Compositae) family of " +
                "dicotyledonous plants, its relatives thus include the sunflower, daisy, chrysanthemum, " +
                "and zinnia. There are 49 species of this genus, with hybrids commonly grown as garden " +
                "plants. Flower forms are variable, with one head per stem; these can be as small as " +
                "5 cm (2 in) diameter or up to 30 cm (1 ft) (\"dinner plate\"). This great variety results " +
                "from dahlias being octoploids—that is, they have eight sets of homologous chromosomes," +
                " whereas most plants have only two. In addition, dahlias also contain many transposons—genetic " +
                "pieces that move from place to place upon an allele—which contributes to their manifesting such " +
                "great diversity.\n" +
                "\n" +
                "The stems are leafy, ranging in height from as low as 30 cm (12 in) to more than " +
                "1.8–2.4 m (6–8 ft). The majority of species do not produce scented flowers. Like most plants " +
                "that do not attract pollinating insects through scent, they are brightly colored, displaying " +
                "most hues, with the exception of blue.");
        flowerInfo.add("Bellis perennis, the daisy, is a European species of the family Asteraceae, " +
                "often considered the archetypal species of the name daisy. To distinguish this species " +
                "from other plants known as daisies, it is sometimes qualified as common daisy, lawn daisy " +
                "or English daisy.\n" +
                "\n" +
                "Bellis perennis is a perennial herbaceous plant growing to 20 centimetres (8 inches) in height. " +
                "It has short creeping rhizomes and rosettes of small rounded or spoon-shaped leaves that are " +
                "from 2 to 5 cm (3⁄4–2 in) long and grow flat to the ground. The species habitually colonises lawns, " +
                "and is difficult to eradicate by mowing, hence the term 'lawn daisy'. It blooms from " +
                "March to September and exhibits the phenomenon of heliotropism, in which the flowers " +
                "follow the position of the sun in the sky.\n");
        flowerInfo.add("Geranium is a genus of 422 species of annual, biennial, and perennial plants " +
                "that are commonly known as geraniums or cranesbills. They are found throughout the " +
                "temperate regions of the world and the mountains of the tropics, but mostly in the " +
                "eastern part of the Mediterranean region.\n" +
                "\n" +
                "The palmately cleft leaves are broadly circular in form. The flowers have five petals " +
                "and are coloured white, pink, purple or blue, often with distinctive veining. Geraniums " +
                "will grow in any soil as long as it is not waterlogged. Propagation is by semiripe cuttings " +
                "in summer, by seed, or by division in autumn or spring.");
        flowerInfo.add("Gerbera is a genus of plants in the Asteraceae (Compositae) family. The first " +
                "scientific description of a Gerbera was made by J. D. Hooker in Curtis's Botanical " +
                "Magazine in 1889 when he described Gerbera jamesonii, a South African species also " +
                "known as Transvaal daisy or Barberton daisy. Gerbera is also commonly known as the " +
                "African daisy.\n" +
                "\n" +
                "Gerbera species are tufted, caulescent, perennial herbs, often with woolly crown, " +
                "up to 80 cm high. Leaves are all in rosette, elliptical with entire or toothed margin " +
                "or lobed, petiolate or with a petaloid base, pinnately veined, often leathery and felted " +
                "beneath. Single to several flowering stems from each rosette bear bracteate or ebracteate," +
                " simple, one-headed inflorescence-capitulum. Capitula are radiate, with several rows of " +
                "bracts. Ray florets are female, 2-lipped, the outer lip is large and strap-shaped, inner " +
                "lip consists of two small, thread-like lobes of white, pink or red, rarely yellow colour. " +
                "Disc florets are fertile, five-lobed and irregularly 2-lipped with curled petals.\n" +
                "\n");
        flowerInfo.add("Nelumbo nucifera, also known as sacred lotus, Laxmi lotus, Indian lotus, or" +
                " simply lotus, is one of two extant species of aquatic plant in the family Nelumbonaceae. " +
                "It is sometimes colloquially called a water lily, though this more often refers to members " +
                "of the family Nymphaeaceae.\n" +
                "\n" +
                "Lotus plants are adapted to grow in the flood plains of slow-moving rivers and delta areas." +
                " Stands of lotus drop hundreds of thousands of seeds every year to the bottom of the pond. " +
                "While some sprout immediately, and most are eaten by wildlife, the remaining seeds can remain " +
                "dormant for an extensive period of time as the pond silts in and dries out. During flood conditions," +
                " sediments containing these seeds are broken open, and the dormant seeds rehydrate and begin a " +
                "new lotus colony.");
        flowerInfo.add("The peony or paeony is a flowering plant in the genus Paeonia , the only genus " +
                "in the family Paeoniaceae. Peonies are native to Asia, Europe and Western North America. " +
                "Scientists differ on the number of species that can be distinguished, ranging from " +
                "25 to 40, although the current consensus is 33 known species. The relationships between " +
                "the species need to be further clarified.\n" +
                "\n" +
                "Most are herbaceous perennial plants 0.25–1 metre (1–3 ft) tall, but some are woody " +
                "shrubs 0.25–3.5 metres (1–11 ft) tall. They have compound, deeply lobed leaves and large, " +
                "often fragrant flowers, in colors ranging from purple and pink to red, white or yellow, " +
                "in late spring and early summer. The flowers have a short blooming season, usually only 7–10 days.\n");
        flowerInfo.add("A poppy is a flowering plant in the subfamily Papaveroideae of the family Papaveraceae. " +
                "Poppies are herbaceous plants, often grown for their colourful flowers. One species " +
                "of poppy, Papaver somniferum, is the source of the narcotic drug mixture opium which " +
                "contains powerful medicinal alkaloids such as morphine and has been used since ancient " +
                "times as an analgesic and narcotic medicinal and recreational drug. It also produces " +
                "edible seeds. Following the trench warfare in the poppy fields of Flanders, Belgium " +
                "during World War I, poppies have become a symbol of remembrance of soldiers who have " +
                "died during wartime, especially in the UK, Canada, Australia, New Zealand and other " +
                "Commonwealth realms.\n" +
                "\n" +
                "Poppies are herbaceous annual, biennial or short-lived perennial plants. Some species " +
                "are monocarpic, dying after flowering. Poppies can be over a metre tall with flowers " +
                "up to 15 centimetres across. Flowers of species (not cultivars) have 4 or 6 petals, " +
                "many stamens forming a conspicuous whorl in the center of the flower and an ovary of " +
                "from 2 to many fused carpels. \n");
        flowerInfo.add("A rose is either a woody perennial flowering plant of the genus Rosa , in the " +
                "family Rosaceae, or the flower it bears. There are over three hundred species and tens " +
                "of thousands of cultivars.[citation needed] They form a group of plants that can be " +
                "erect shrubs, climbing, or trailing, with stems that are often armed with sharp prickles." +
                " Their flowers vary in size and shape and are usually large and showy, in colours " +
                "ranging from white through yellows and reds. Most species are native to Asia, with " +
                "smaller numbers native to Europe, North America, and northwestern Africa. Species, " +
                "cultivars and hybrids are all widely grown for their beauty and often are fragrant. " +
                "Roses have acquired cultural significance in many societies. Rose plants range in size" +
                " from compact, miniature roses, to climbers that can reach seven meters in height. " +
                "Different species hybridize easily, and this has been used in the development of the " +
                "wide range of garden roses.\n" +
                "\n" +
                "The name rose comes from Latin rosa, which was perhaps borrowed from Oscan, from Greek," +
                " itself borrowed from Old Persian word, related to Avestan varəδa, Sogdian ward, " +
                "Parthian wâr.");
        flowerInfo.add("The common sunflower (Helianthus annuus) is a large annual forb of the genus" +
                " Helianthus. It is commonly grown as a crop for its edible oily seeds. Apart " +
                "from cooking oil production, it is also used as livestock forage (as a meal or a " +
                "silage plant), as bird food, in some industrial applications, and as an ornamental " +
                "in domestic gardens. Wild H. annuus is a widely branched annual plant with many flower " +
                "heads. The domestic sunflower, however, often possesses only a single large inflorescence" +
                " (flower head) atop an unbranched stem.\n" +
                "\n" +
                "The binomial name Helianthus annuus is derived from the Greek Helios 'sun' and anthos " +
                "'flower', while the epithet annuus means 'annual' in Latin.\n" +
                "\n" +
                "The plant was first domesticated in the Americas. Sunflower seeds were brought to Europe" +
                " from the Americas in the 16th century, where, along with sunflower oil, they became a " +
                "widespread cooking ingredient. With time, the bulk of industrial-scale production has " +
                "shifted to Eastern Europe, and (as of 2020) Russi and Ukraine together produce over " +
                "half of worldwide seed production.\n" +
                "\n" +
                "\n");
    }

    public void loadFavoriteFlowers(){
        for(int i=0;i<5;i++){
            Favorite fav = new Favorite();
            fav.name = flowerNames.get(i);
            fav.Info = flowerInfo.get(i);
            fav.imageResource = flowerList.get(i);
            fav.viewingSeason = flowerViewingSeason.get(i);
            favoriteFlowers.add(fav);
        }

    }

    public void loadFlowerViewingSeason(){
        flowerViewingSeason.add("Cherry blossom season in Japan is generally said to be late March to " +
                "April, but given the geographical scope of the country, the blooming period actually " +
                "covers around 4 months!");
        flowerViewingSeason.add("Dahlias are warm-weather flowers that bloom mid-summer through fall. " +
                "They begin to bloom a couple of months after the soil warms, and continue to bloom " +
                "until early to mid-fall.");
        flowerViewingSeason.add("The plants tend to grow between one and three feet tall. The blooms " +
                "usually emerge during late spring, and the blooming continues until early fall.");
        flowerViewingSeason.add("Geraniums are appreciated for their long blooming season that starts " +
                "in spring and can last into fall. If plants are kept above 45 to 50 degrees, they may also " +
                "bloom in winter to early spring.");
        flowerViewingSeason.add("Gerberas produce flowers from late spring through autumn in the garden, " +
                "and their blooms make long-lasting cut flowers.");
        flowerViewingSeason.add("Lotus are perennial plants that shoot in spring, then flower during summer " +
                "& autumn before going dormant in winter.");
        flowerViewingSeason.add("When do peonies bloom? In most locations, flowers will bloom in April, May or June. " +
                "Expect tree peonies to bloom first (around Mother's Day), followed by herbaceous varieties " +
                "(around Memorial Day) and then the intersectionals. " +
                "Include all three types in the garden to enjoy blooms for up to seven weeks.");
        flowerViewingSeason.add("They thrive in the cooler conditions of late winter to early summer," +
                " blooming mainly between April and June, depending on the species and hardiness zone. " +
                "Some poppies will bloom deeper into summer where nights remain cool.");
        flowerViewingSeason.add("Most roses bloom between late spring and early fall, typically taking " +
                "about six weeks to produce each new set of flowers as the plant continues growing " +
                "throughout the season.");
        flowerViewingSeason.add("When do sunflowers bloom? Annual sunflowers bloom during summer and into autumn. " +
                "Sow new plants every few weeks and you'll enjoy non-stop flowers until the first frost. " +
                "Perennial sunflowers bloom for a period of 8-12 weeks with some beginning as early as July " +
                "and others finishing as late as October.");

    }

    public ArrayList<String> getFlowerNames(){
        return flowerNames;
    }
    public ArrayList<Integer> getFlowerList(){
        return flowerList;
    }

    public ArrayList<String> getFlowerInfo(){
      return flowerInfo;
    };

    public ArrayList<Favorite> getFlowerFavorites(){
        return favoriteFlowers;
    }

    public ArrayList<String> getFlowerViewingSeason(){
        return flowerViewingSeason;
    }

    public class Favorite {
        public String name;
        public String Info;
        public int imageResource;
        public String viewingSeason;
    }
}
