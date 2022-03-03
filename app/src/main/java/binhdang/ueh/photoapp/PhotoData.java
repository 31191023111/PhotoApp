package binhdang.ueh.photoapp;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData(){
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(0,
                "https://www.expatica.com/app/uploads/sites/5/2014/05/french-onion-soup-1536x1024.jpg",
                "Soupe à l’oignon",
                "This is a traditional French soup made of onions and beef stock, usually served with croutons and melted cheese on top. Dating back to Roman times, this was traditionally a peasant dish although the current version dates from the 18th century."));
        photos.add(new Photo(1,
                "https://www.expatica.com/app/uploads/sites/5/2014/05/coq-au-vin-1-1536x1024.jpg",
                "Coq au vin",
                "This quintessential French food was popularized by Julia Child, becoming one of her signature dishes. The dish sees chicken braised with wine, mushrooms, salty pork or bacon (lardons), mushrooms, onions, garlic and sometimes even a drop of brandy."));
        photos.add(new Photo(2,
                "https://www.expatica.com/app/uploads/sites/5/2014/05/cassoulet-1536x1024.jpg",
                "Cassoulet",
                "Cassoulet is a comfort dish of white beans stewed slowly with meat. The dish typically uses pork or duck but can include sausages, goose, mutton or whatever else the chef has lying around."));
        photos.add(new Photo(3,
                "https://www.expatica.com/app/uploads/sites/5/2014/05/boeuf-bourguignon-1536x1024.jpg",
                "Bœuf bourguignon",
                "Dishes don’t get much more typically French than bœuf bourguignon. The dish hails from the same region as coq au vin – that’s Burgundy in eastern France – and there are similarities between the two dishes."));
        photos.add(new Photo(4,
                "https://www.expatica.com/app/uploads/sites/5/2014/05/chocolate-souffle%CC%81-1536x1024.jpg",
                "Chocolate soufflé",
                "The word soufflé comes from the French verb ‘to blow’ and, as the name suggests, this is a light, airy dessert. The dish dates back to the early 18th century and nowadays is a staple on dessert menus around the world."));
        photos.add(new Photo(5,
                "https://www.expatica.com/app/uploads/sites/5/2014/05/flamiche-1536x1024.jpg",
                "Flamiche",
                "Flamiche means ‘cake’ in Dutch and this dish originates from northern France, near the border with Belgium. It has a puff-pastry crust filled with cheese and vegetables and resembles a quiche."));
        photos.add(new Photo(6,
                "https://www.expatica.com/app/uploads/sites/5/2014/05/confit-de-canard-1536x1024.jpg",
                "Confit de canard",
                "Confit de canard is a tasty French dish of duck – although some chefs use goose or pork – and is one of the finest French dishes. The meat is specially prepared using ancient preservation and slow-cooking process (confit)."));
        photos.add(new Photo(7,
                "https://www.expatica.com/app/uploads/sites/5/2014/05/salade-nic%CC%A7oise-1536x1024.jpg",
                "Salade Niçoise",
                "Salade Niçoise is a typical French salad from the Provence region. Often eaten as a side dish, it can also be a light meal on its own."));
        photos.add(new Photo(8,
                "https://www.expatica.com/app/uploads/sites/5/2014/05/ratatouille-1536x1024.jpg",
                "Ratatouille",
                "Not just a lovable cartoon about a friendly rat, ratatouille is also one of France’s most iconic dishes. From Provence, the dish sees vegetables shallow-fried and then layered in a casserole dish before being baked in an oven."));
        photos.add(new Photo(9,
                "https://www.expatica.com/app/uploads/sites/5/2014/05/tarte-tatin-1536x1024.jpg",
                "Tarte Tatin",
                "According to culinary legend, tarte Tatin started life as a mistake. In 1898, hotelier Stephanie Tatin was making a traditional apple pie when she accidentally left the apples cooking in sugar and butter for too long."));
        return photos;
    }

    public static Photo getPhotoFromId(int id){
        ArrayList<Photo> phs = generatePhotoData();
        for(int i = 0; i < phs.size(); i++){
            if(phs.get(i).getId() == id){
                return phs.get(i);
            }
        }
        return null;
    }
}
