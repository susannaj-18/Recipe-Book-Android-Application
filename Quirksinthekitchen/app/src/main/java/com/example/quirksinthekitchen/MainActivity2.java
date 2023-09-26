package com.example.quirksinthekitchen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;


    List<Recipes> recipes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String cuisine = intent.getStringExtra("cuisine");
        recipes = new ArrayList<>();
        if (cuisine != null) {
            switch (cuisine) {
                case "south":

                    recipes.add(new Recipes("Masala Dosa",
                            "For the Dosa Batter:\n" +
                                    "2 cups parboiled rice\n" +
                                    "1/2 cup urad dal (split black gram)\n" +
                                    "1/4 cup poha (flattened rice)\n" +
                                    "1/2 tsp fenugreek seeds\n" +
                                    "Salt (to taste)\n" +
                                    "For the Potato Masala Filling:\n" +
                                    "3-4 medium-sized potatoes (boiled and mashed)\n" +
                                    "1 onion (finely chopped)\n" +
                                    "2-3 green chilies (finely chopped)\n" +
                                    "1 tsp mustard seeds\n" +
                                    "1/2 tsp turmeric powder\n" +
                                    "A few curry leaves\n" +
                                    "Salt (to taste)\n" +
                                    "Oil (for cooking)",
                            "Method",
                            "1. To make the dosa batter, rinse the rice, urad dal, fenugreek seeds, and poha separately. Soak them in water for 4-5 hours.\n" +
                                    "2. Drain the water and grind the soaked ingredients together in a blender to make a smooth batter. Add water as needed.\n" +
                                    "3. Add salt to the batter and mix well. Ferment the batter overnight or for at least 8 hours.\n" +
                                    "4. To make the potato masala filling, heat oil in a pan and add mustard seeds. Once they splutter, add curry leaves, chopped onion, and green chilies. Sauté until the onion turns translucent.\n" +
                                    "5. Add turmeric powder and mashed potatoes to the pan. Mix well and cook for a few minutes. Add salt to taste.\n" +
                                    "6. Heat a non-stick tawa or griddle and pour a ladleful of dosa batter. Spread it in a circular motion to form a thin dosa.\n" +
                                    "7. Drizzle oil around the edges of the dosa. Once the dosa turns golden brown, flip it over.\n" +
                                    "8. Place a portion of the potato masala filling in the center of the dosa and fold it.\n" +
                                    "9. Serve the masala dosa hot with coconut chutney and sambar.",
                            R.drawable.dosa1));
                    recipes.add(new Recipes("Idli\n", "Ingredients\n2 cups parboiled rice" +
                            "1 cup urad dal\n" +
                            "1/2 teaspoon fenugreek seeds\n" +
                            "Salt (to taste)\n" +
                            "Water (as required)\n" +
                            "Oil (for greasing)\n", "Method",
                            "Wash the rice, urad dal, and fenugreek seeds separately. Soak them in water for about 4-5 hours.\n" +
                                    "Grind the soaked rice, urad dal, and fenugreek seeds separately to a smooth paste.\n" +
                                    "Mix the rice batter and urad dal batter together in a large bowl. Add salt and mix well.\n" +
                                    "Cover the bowl with a lid and let the batter ferment in a warm place for about 8-10 hours or overnight.\n" +
                                    "Grease the idli molds with oil. Pour the batter into the molds, filling them about 3/4th full.\n" +
                                    "Steam the idlis in a steamer for about 10-12 minutes or until a toothpick inserted into the center comes out clean.\n" +
                                    "Remove the idlis from the molds and serve hot with chutney and sambar.", R.drawable.idli));

                    recipes.add(new Recipes("Coconut Chutney",
                            "Ingredients\n1 cup grated coconut\n" +
                                    "2-3 green chilies\n" +
                                    "1-inch piece of ginger\n" +
                                    "1/2 cup roasted chana dal (split roasted gram)\n" +
                                    "A small handful of coriander leaves\n" +
                                    "Salt (to taste)\n" +
                                    "Water (as required)",
                            "Method",
                            "1. In a blender, add grated coconut, green chilies, ginger, roasted chana dal, coriander leaves, and salt.\n" +
                                    "2. Blend everything together, adding water gradually, until you get a smooth and thick chutney.\n" +
                                    "3. Transfer the chutney to a serving bowl.\n" +
                                    "4. Serve the coconut chutney with dosa, idli, or any other South Indian dish.",
                            R.drawable.coco));
                    recipes.add(new Recipes("Sambar",
                            "Ingredients\nFor the Sambar:\n" +
                                    "1 cup toor dal (split pigeon peas)\n" +
                                    "2 cups mixed vegetables (carrots, beans, drumsticks, pumpkin, etc.)\n" +
                                    "1 onion (chopped)\n" +
                                    "2 tomatoes (chopped)\n" +
                                    "1 green chili (slit)\n" +
                                    "1 tbsp sambar powder\n" +
                                    "1/2 tsp turmeric powder\n" +
                                    "1/2 tsp mustard seeds\n" +
                                    "A few curry leaves\n" +
                                    "Tamarind pulp (lemon-sized ball soaked in water)\n" +
                                    "Salt (to taste)\n" +
                                    "For the Sambar Masala:\n" +
                                    "1 tbsp chana dal (split Bengal gram)\n" +
                                    "1 tbsp urad dal (split black gram)\n" +
                                    "1 tsp coriander seeds\n" +
                                    "1/2 tsp fenugreek seeds\n" +
                                    "4-5 dry red chilies\n" +
                                    "1/2 tsp cumin seeds",
                            "Method",
                            "1. Pressure cook the toor dal with enough water until it becomes soft and mushy. Set aside.\n" +
                                    "2. In a pan, dry roast the ingredients for the sambar masala (chana dal, urad dal, coriander seeds, fenugreek seeds, dry red chilies, and cumin seeds) until they turn aromatic. Let them cool.\n" +
                                    "3. Grind the roasted ingredients into a fine powder to make the sambar masala.\n" +
                                    "4. In a large pot, add the mixed vegetables, chopped onion, chopped tomatoes, slit green chili, turmeric powder, and sambar masala. Add water and cook until the vegetables become tender.\n" +
                                    "5. Add the cooked toor dal to the pot and mix well. Add tamarind pulp and salt to taste. Simmer for a few minutes.\n" +
                                    "6. In a separate pan, heat oil and add mustard seeds. Once they splutter, add curry leaves and pour this tempering into the sambar.\n" +
                                    "7. Serve the sambar hot with idli, dosa, or rice.",
                            R.drawable.sambar));
                    recipes.add(new Recipes("Pongal",
                            "Ingredients\nFor the Pongal:\n" +
                                    "1 cup rice\n" +
                                    "1/2 cup split moong dal\n" +
                                    "1/4 cup ghee\n" +
                                    "1 tsp cumin seeds\n" +
                                    "1 tsp black peppercorns\n" +
                                    "A pinch of asafoetida\n" +
                                    "A few curry leaves\n" +
                                    "Cashews (optional)\n" +
                                    "Salt (to taste)",
                            "Method",
                            "1. Dry roast the moong dal until it turns aromatic. Wash the rice and moong dal together and drain the water.\n" +
                                    "2. In a pressure cooker, add the washed rice and dal along with 4 cups of water. Pressure cook until they become soft and mushy.\n" +
                                    "3. In a pan, heat ghee and add cumin seeds, black peppercorns, asafoetida, and curry leaves. Add cashews if desired.\n" +
                                    "4. Sauté the ingredients until the cashews turn golden brown and the spices become fragrant.\n" +
                                    "5. Add the cooked rice and dal mixture to the pan. Mix well with the spices and season with salt.\n" +
                                    "6. Cook for a few minutes, allowing the flavors to blend together.\n" +
                                    "7. Serve hot Pongal with coconut chutney and sambar.",
                            R.drawable.pongal));

                    break;
                case "north":

                    recipes.add(new Recipes("Butter Chicken", "Ingredients\nFor marination:\n" +
                            "500 grams boneless chicken pieces\n" +
                            "1 cup yogurt\n" +
                            "1 tablespoon ginger-garlic paste\n" +
                            "1 teaspoon red chili powder\n" +
                            "1/2 teaspoon turmeric powder\n" +
                            "1 tablespoon lemon juice\n" +
                            "Salt (to taste)\n" +
                            "For the gravy:\n" +
                            "2 tablespoons butter\n" +
                            "2 onions, finely chopped\n" +
                            "2 teaspoons ginger-garlic paste\n" +
                            "2 tomatoes, pureed\n" +
                            "1 teaspoon red chili powder\n" +
                            "1/2 teaspoon garam masala\n" +
                            "1/2 teaspoon dried fenugreek leaves (kasuri methi)\n" +
                            "1/4 cup fresh cream\n" +
                            "Salt (to taste)\n" +
                            "Fresh coriander leaves, for garnishing", "Method",
                            "In a bowl, marinate the chicken with yogurt, ginger-garlic paste, red chili powder, turmeric powder, lemon juice, and salt. Let it marinate for at least 1 hour.\n" +
                                    "Heat butter in a pan and sauté the onions until golden brown.\n" +
                                    "Add ginger-garlic paste and cook until the raw smell goes away.\n" +
                                    "Add the tomato puree, red chili powder, garam masala, dried fenugreek leaves, and salt. Cook until the oil separates from the masala.\n" +
                                    "Add the marinated chicken and cook until it is fully cooked and tender.\n" +
                                    "Stir in the fresh cream and cook for another 2-3 minutes.\n" +
                                    "Garnish with fresh coriander leaves and serve hot with naan or rice.", R.drawable.butter));
                    recipes.add(new Recipes(
                            "Gobi Manchurian",
                            "Ingredients:\n" +
                                    "For the Manchurian Balls:\n" +
                                    "2 cups cauliflower florets\n" +
                                    "1/2 cup all-purpose flour\n" +
                                    "2 tbsp corn flour\n" +
                                    "1 tsp ginger-garlic paste\n" +
                                    "1/2 tsp red chili powder\n" +
                                    "1/4 tsp black pepper powder\n" +
                                    "Salt (to taste)\n" +
                                    "Water (as needed)\n" +
                                    "Oil (for deep frying)\n" +
                                    "For the Manchurian Sauce:\n" +
                                    "1 onion (finely chopped)\n" +
                                    "1 capsicum (finely chopped)\n" +
                                    "2 tbsp soy sauce\n" +
                                    "1 tbsp tomato ketchup\n" +
                                    "1 tsp vinegar\n" +
                                    "1 tsp ginger-garlic paste\n" +
                                    "1 tsp red chili sauce\n" +
                                    "1/4 tsp black pepper powder\n" +
                                    "Salt (to taste)\n" +
                                    "2 tbsp spring onions (chopped)",
                            "Method:",
                            "1. In a bowl, mix all-purpose flour, corn flour, ginger-garlic paste, red chili powder, black pepper powder, and salt to make a thick batter. Add water gradually and whisk until a smooth batter is formed.\n" +
                                    "2. Dip the cauliflower florets into the batter, ensuring they are coated well.\n" +
                                    "3. Heat oil in a deep pan and deep fry the cauliflower florets until they turn golden brown. Drain on a paper towel to remove excess oil.\n" +
                                    "4. In a separate pan, heat some oil and sauté chopped onions and capsicum until they are slightly cooked.\n" +
                                    "5. Add ginger-garlic paste and cook until fragrant.\n" +
                                    "6. Add soy sauce, tomato ketchup, vinegar, red chili sauce, black pepper powder, and salt. Mix well.\n" +
                                    "7. Add the fried cauliflower florets to the pan and toss them in the sauce until they are well coated.\n" +
                                    "8. Garnish with chopped spring onions.\n" +
                                    "9. Serve hot as an appetizer or with fried rice/noodles.",
                            R.drawable.gobi));

                    recipes.add(new Recipes("Paneer Tikka", "Ingredients\nFor marinade:\n" +
                            "200 grams paneer, cut into cubes\n" +
                            "1/4 cup yogurt\n" +
                            "1 tablespoon ginger-garlic paste\n" +
                            "1 teaspoon red chili powder\n" +
                            "1/2 teaspoon turmeric powder\n" +
                            "1 teaspoon garam masala\n" +
                            "1 tablespoon lemon juice\n" +
                            "Salt (to taste)\n" +
                            "For the tikka:\n" +
                            "1 onion, cut into squares\n" +
                            "1 bell pepper, cut into squares\n" +
                            "1 tomato, cut into squares\n" +
                            "2 tablespoons oil\n" +
                            "1/2 teaspoon chaat masala\n" +
                            "Fresh coriander leaves, for garnishing", "Method",
                            "In a bowl, mix together yogurt, ginger-garlic paste, red chili powder, turmeric powder, garam masala, lemon juice, and salt.\n" +
                                    "Add paneer cubes to the marinade and let it marinate for at least 30 minutes.\n" +
                                    "Thread the marinated paneer, onion, bell pepper, and tomato onto skewers.\n" +
                                    "Heat oil in a pan or grill pan and cook the skewers until the paneer and vegetables are grilled and slightly charred.\n" +
                                    "Sprinkle chaat masala over the cooked tikka.\n" +
                                    "Garnish with fresh coriander leaves and serve hot as an appetizer or with roti or naan.", R.drawable.paneer));
                    recipes.add(new Recipes("Chole Bhature",
                            "Ingredients\nFor the Chole (Chickpea Curry):\n" +
                                    "1 cup chickpeas (soaked overnight)\n" +
                                    "2 onions (finely chopped)\n" +
                                    "2 tomatoes (pureed)\n" +
                                    "2 tsp ginger-garlic paste\n" +
                                    "2 tsp chole masala\n" +
                                    "1 tsp cumin seeds\n" +
                                    "1 tsp turmeric powder\n" +
                                    "1 tsp red chili powder\n" +
                                    "A pinch of asafoetida\n" +
                                    "Salt (to taste)\n" +
                                    "For the Bhature (Fried Bread):\n" +
                                    "2 cups all-purpose flour\n" +
                                    "1/2 cup yogurt\n" +
                                    "1 tsp sugar\n" +
                                    "1 tsp baking powder\n" +
                                    "Salt (to taste)\n" +
                                    "Oil (for frying)",
                            "Method",
                            "1. Pressure cook the soaked chickpeas with water and salt until they are soft.\n" +
                                    "2. Heat oil in a pan and add cumin seeds and asafoetida.\n" +
                                    "3. Add chopped onions and sauté until golden brown.\n" +
                                    "4. Add ginger-garlic paste and cook until fragrant.\n" +
                                    "5. Add tomato puree, chole masala, turmeric powder, red chili powder, and salt. Cook until the oil separates from the masala.\n" +
                                    "6. Add the cooked chickpeas along with some water. Simmer for 15-20 minutes.\n" +
                                    "7. For the bhature, mix all-purpose flour, yogurt, sugar, baking powder, and salt in a bowl. Knead into a soft dough.\n" +
                                    "8. Divide the dough into small balls and roll them into round discs.\n" +
                                    "9. Heat oil in a deep pan and fry the bhature until they puff up and turn golden brown.\n" +
                                    "10. Serve hot chole with bhature.",
                            R.drawable.cb));
                    recipes.add(new Recipes("Rajma Chawal",
                            "Ingredients\nFor the Rajma (Kidney Beans):\n" +
                                    "1 cup kidney beans (soaked overnight)\n" +
                                    "2 onions (finely chopped)\n" +
                                    "2 tomatoes (pureed)\n" +
                                    "2 tsp ginger-garlic paste\n" +
                                    "1 tsp cumin seeds\n" +
                                    "1 tsp turmeric powder\n" +
                                    "1 tsp red chili powder\n" +
                                    "1 tsp garam masala\n" +
                                    "A pinch of asafoetida\n" +
                                    "Salt (to taste)\n" +
                                    "For the Chawal (Rice):\n" +
                                    "1 cup basmati rice\n" +
                                    "2 cups water\n" +
                                    "1 tsp ghee\n" +
                                    "Salt (to taste)",
                            "Method",
                            "1. Pressure cook the soaked kidney beans with water and salt until they are soft.\n" +
                                    "2. Heat oil in a pan and add cumin seeds and asafoetida.\n" +
                                    "3. Add chopped onions and sauté until golden brown.\n" +
                                    "4. Add ginger-garlic paste and cook until fragrant.\n" +
                                    "5. Add tomato puree, turmeric powder, red chili powder, garam masala, and salt. Cook until the oil separates from the masala.\n" +
                                    "6. Add the cooked kidney beans along with some water. Simmer for 15-20 minutes.\n" +
                                    "7. For the rice, wash the basmati rice and drain the water.\n" +
                                    "8. In a separate pot, heat ghee and add the washed rice. Sauté for a few minutes.\n" +
                                    "9. Add water and salt. Cook the rice until it is fluffy and cooked through.\n" +
                                    "10. Serve hot rajma with rice.",
                            R.drawable.rc));
                    recipes.add(new Recipes("Palak Paneer",
                            "Ingredients\nFor the Palak Paste:\n" +
                                    "2 cups spinach (blanched and chopped)\n" +
                                    "1 green chili\n" +
                                    "1-inch piece of ginger\n" +
                                    "For the Curry:\n" +
                                    "200g paneer (cubed)\n" +
                                    "1 onion (finely chopped)\n" +
                                    "2 tomatoes (pureed)\n" +
                                    "1 tsp cumin seeds\n" +
                                    "1 tsp garam masala\n" +
                                    "1/2 tsp turmeric powder\n" +
                                    "1/2 tsp red chili powder\n" +
                                    "1/2 cup heavy cream\n" +
                                    "Salt (to taste)\n" +
                                    "Oil (for cooking)",
                            "Method",
                            "1. To make the palak paste, blanch the spinach in boiling water for 2-3 minutes. Drain the water and transfer the spinach to a blender.\n" +
                                    "2. Add green chili and ginger to the blender and blend everything into a smooth paste. Set aside.\n" +
                                    "3. Heat oil in a pan and add cumin seeds. Let them splutter.\n" +
                                    "4. Add finely chopped onion and sauté until golden brown.\n" +
                                    "5. Add tomato puree, turmeric powder, red chili powder, and garam masala. Cook until the oil separates from the masala.\n" +
                                    "6. Add the prepared palak paste and mix well. Cook for 2-3 minutes.\n" +
                                    "7. Add paneer cubes and salt to taste. Mix gently and cook for another 2-3 minutes.\n" +
                                    "8. Finally, add heavy cream and mix well. Cook for a minute.\n" +
                                    "9. Serve hot with naan or rice.",
                            R.drawable.pp));

                    break;
                case "korean":

                    recipes.add(new Recipes("Bibimbap", "Ingredients\nFor the sauce:\n" +
                            "2 tablespoons gochujang (Korean chili paste)\n" +
                            "1 tablespoon soy sauce\n" +
                            "1 tablespoon sesame oil\n" +
                            "1 tablespoon honey\n" +
                            "1 tablespoon rice vinegar\n" +
                            "For the bibimbap:\n" +
                            "2 cups cooked rice\n" +
                            "1 cup julienned carrots\n" +
                            "1 cup julienned cucumber\n" +
                            "1 cup bean sprouts\n" +
                            "1 cup spinach, blanched and squeezed\n" +
                            "1 cup sliced mushrooms\n" +
                            "2 tablespoons vegetable oil\n" +
                            "4 eggs\n" +
                            "Salt (to taste)\n" +
                            "Sesame seeds, for garnishing\n" +
                            "Chopped green onions, for garnishing", "Method",
                            "In a small bowl, whisk together the gochujang, soy sauce, sesame oil, honey, and rice vinegar to make the sauce.\n" +
                                    "Divide the cooked rice among serving bowls.\n" +
                                    "Arrange the julienned carrots, cucumber, bean sprouts, blanched spinach, and sliced mushrooms on top of the rice in separate sections.\n" +
                                    "Heat vegetable oil in a skillet over medium heat. Fry the eggs sunny-side up or to your desired doneness. Season with salt.\n" +
                                    "Place a fried egg on top of each bowl of bibimbap.\n" +
                                    "Drizzle the sauce over the ingredients.\n" +
                                    "Garnish with sesame seeds and chopped green onions. Serve hot and mix the ingredients together before eating.", R.drawable.bb));

                    recipes.add(new Recipes("Tofu Kimchi", "Ingredients\n1 block tofu\n" +
                            "1 cup kimchi\n" +
                            "2 green onions, chopped\n" +
                            "1 teaspoon sesame oil\n" +
                            "1 teaspoon soy sauce\n" +
                            "1/2 teaspoon sugar\n" +
                            "1/4 teaspoon roasted sesame seeds", "Method",
                            "Cut the tofu into cubes and drain excess water.\n" +
                                    "Heat a non-stick skillet over medium heat. Add the tofu cubes and cook until golden brown on all sides.\n" +
                                    "In a separate bowl, combine the kimchi, chopped green onions, sesame oil, soy sauce, sugar, and roasted sesame seeds.\n" +
                                    "Add the cooked tofu to the kimchi mixture and toss gently to coat.\n" +
                                    "Let the flavors meld for a few minutes before serving.\n" +
                                    "Serve hot or cold as a side dish or as part of a Korean meal.", R.drawable.tofu));
                    recipes.add(new Recipes("Japchae",
                            "For the Noodles:\n" +
                                    "200g sweet potato starch noodles\n" +
                                    "1 tbsp sesame oil\n" +
                                    "For the Vegetables:\n" +
                                    "1 onion (sliced)\n" +
                                    "1 carrot (julienned)\n" +
                                    "1 bell pepper (sliced)\n" +
                                    "2 cups spinach\n" +
                                    "For the Sauce:\n" +
                                    "2 tbsp soy sauce\n" +
                                    "1 tbsp sesame oil\n" +
                                    "1 tbsp sugar\n" +
                                    "1 clove garlic (minced)\n" +
                                    "For Garnish:\n" +
                                    "Toasted sesame seeds\n" +
                                    "Green onions (sliced)",
                            "Method",
                            "1. Cook the sweet potato starch noodles according to the package instructions. Drain and rinse with cold water.\n" +
                                    "2. In a large pan, heat sesame oil and stir-fry the sliced onion, carrot, and bell pepper until tender. Set aside.\n" +
                                    "3. Blanch the spinach in boiling water for a minute. Drain and rinse with cold water. Squeeze out excess water.\n" +
                                    "4. In a small bowl, mix together the sauce ingredients: soy sauce, sesame oil, sugar, and minced garlic.\n" +
                                    "5. In the same pan, add the cooked noodles, vegetables, and sauce. Stir-fry until everything is well combined.\n" +
                                    "6. Garnish with toasted sesame seeds and sliced green onions before serving.",
                            R.drawable.japchae));
                    recipes.add(new Recipes("Kimchi Fried Rice",
                            "Ingredients\n2 cups cooked rice (preferably day-old)\n" +
                                    "1 cup kimchi (chopped)\n" +
                                    "1/2 cup kimchi juice\n" +
                                    "1/2 cup tofu (cubed)\n" +
                                    "1/2 cup mixed vegetables (carrots, peas, corn)\n" +
                                    "2 cloves garlic (minced)\n" +
                                    "1 tbsp soy sauce\n" +
                                    "1 tbsp sesame oil\n" +
                                    "1 tbsp vegetable oil\n" +
                                    "2 green onions (sliced)\n" +
                                    "Salt and pepper (to taste)",
                            "Method",
                            "1. Heat vegetable oil in a pan or wok over medium heat.\n" +
                                    "2. Add minced garlic and sauté until fragrant.\n" +
                                    "3. Add tofu and mixed vegetables. Cook for a few minutes until the vegetables are tender.\n" +
                                    "4. Add chopped kimchi and kimchi juice. Stir-fry for a couple of minutes.\n" +
                                    "5. Add cooked rice, soy sauce, sesame oil, salt, and pepper. Mix well to combine.\n" +
                                    "6. Cook for a few more minutes until the rice is heated through.\n" +
                                    "7. Garnish with sliced green onions before serving.",
                            R.drawable.kimchi));
                    recipes.add(new Recipes("Vegetarian dumplings",
                            "Ingredients\nFor the Dough:\n" +
                                    "2 cups all-purpose flour\n" +
                                    "Water (as needed)\n" +
                                    "For the Filling:\n" +
                                    "2 cups mixed vegetables (finely chopped, such as cabbage, carrots, bell peppers, etc.)\n" +
                                    "1/2 cup onion (finely chopped)\n" +
                                    "2 cloves garlic (minced)\n" +
                                    "1 tablespoon ginger (minced)\n" +
                                    "1 tablespoon soy sauce\n" +
                                    "1 tablespoon sesame oil\n" +
                                    "1 teaspoon salt (or to taste)\n" +
                                    "1/2 teaspoon black pepper\n" +
                                    "For the Dipping Sauce:\n" +
                                    "2 tablespoons soy sauce\n" +
                                    "1 tablespoon vinegar\n" +
                                    "1 tablespoon sesame oil\n" +
                                    "1 teaspoon chili sauce (optional)\n" ,
                                    "Method:\n" ,
                                    "1. In a mixing bowl, combine the all-purpose flour with water gradually to form a smooth dough. Knead the dough for a few minutes, then cover and let it rest for 30 minutes.\n" +
                                    "2. In a separate bowl, mix together the chopped vegetables, onion, garlic, ginger, soy sauce, sesame oil, salt, and black pepper to make the filling.\n" +
                                    "3. Roll out the dough into thin circles on a lightly floured surface. Place a spoonful of the vegetable filling in the center of each circle.\n" +
                                    "4. Fold the edges of the circle to form a crescent shape and pinch the edges together to seal the momo.\n" +
                                    "5. Steam the momos in a steamer for about 10-12 minutes, or until the dough is cooked and the filling is tender.\n" +
                                    "6. For the dipping sauce, mix together soy sauce, vinegar, sesame oil, and chili sauce (optional) in a small bowl.\n" +
                                    "7. Serve the vegetarian momos hot with the dipping sauce.",
                            R.drawable.momos));
                    break;
                case "chinese":

                    recipes.add(new Recipes("Spring Rolls", "Ingredients\nFor the filling:\n" +
                            "2 cups shredded cabbage\n" +
                            "1 cup shredded carrots\n" +
                            "1 cup bean sprouts\n" +
                            "1/2 cup sliced mushrooms\n" +
                            "2 cloves garlic, minced\n" +
                            "1 tablespoon soy sauce\n" +
                            "1 tablespoon hoisin sauce\n" +
                            "1/2 teaspoon sesame oil\n" +
                            "1/2 teaspoon sugar\n" +
                            "For the wrappers:\n" +
                            "12 spring roll wrappers\n" +
                            "1 tablespoon cornstarch mixed with 2 tablespoons water (for sealing)\n" +
                            "Oil for frying", "Method",
                            "In a large bowl, combine the shredded cabbage, carrots, bean sprouts, sliced mushrooms, minced garlic, soy sauce, hoisin sauce, sesame oil, and sugar. Mix well.\n" +
                                    "Place a spring roll wrapper on a flat surface. Spoon about 2 tablespoons of the vegetable filling onto the wrapper. Fold the sides of the wrapper over the filling, then roll tightly to enclose the filling completely.\n" +
                                    "Seal the edge of the wrapper with the cornstarch-water mixture to secure the spring roll.\n" +
                                    "Repeat with the remaining wrappers and filling.\n" +
                                    "Heat oil in a deep pan or skillet over medium heat. Fry the spring rolls until golden brown and crispy.\n" +
                                    "Remove from the pan and drain on paper towels to remove excess oil.\n" +
                                    "Serve hot with dipping sauce of your choice.", R.drawable.spring));

                    recipes.add(new Recipes("Vegetable Fried Rice", "Ingredients\n2 cups cooked rice\n" +
                            "1 cup mixed vegetables (carrots, peas, corn, bell peppers, etc.)\n" +
                            "2 cloves garlic, minced\n" +
                            "1/2 cup diced onions\n" +
                            "2 tablespoons soy sauce\n" +
                            "1 tablespoon oyster sauce (optional)\n" +
                            "1/2 teaspoon sesame oil\n" +
                            "2 eggs, beaten\n" +
                            "2 tablespoons oil for frying\n" +
                            "Salt and pepper to taste", "Method",
                            "Heat oil in a large skillet or wok over medium heat.\n" +
                                    "Add the minced garlic and diced onions. Stir-fry until the onions are translucent.\n" +
                                    "Push the garlic and onions to one side of the skillet and pour the beaten eggs into the empty space. Scramble the eggs until cooked.\n" +
                                    "Add the mixed vegetables to the skillet and stir-fry until they are cooked but still crispy.\n" +
                                    "Add the cooked rice to the skillet and mix well with the vegetables, garlic, onions, and eggs.\n" +
                                    "Pour in the soy sauce, oyster sauce (if using), and sesame oil. Stir-fry for a few more minutes.\n" +
                                    "Season with salt and pepper to taste.\n" +
                                    "Serve hot as a main dish or as a side with other Chinese dishes.", R.drawable.fried));
                    recipes.add(new Recipes("Ma Po Eggplant",
                            "Ingredients:\n" +
                                    "2 medium eggplants, cut into cubes\n" +
                                    "2 tablespoons vegetable oil\n" +
                                    "2 cloves garlic, minced\n" +
                                    "1 tablespoon ginger, minced\n" +
                                    "2 green onions, chopped\n" +
                                    "2 tablespoons fermented black beans, rinsed and mashed\n" +
                                    "2 tablespoons chili bean sauce\n" +
                                    "1 cup vegetable broth\n" +
                                    "1 tablespoon soy sauce\n" +
                                    "1 teaspoon sugar\n" +
                                    "1 teaspoon cornstarch dissolved in 2 tablespoons water\n" ,
                                    "Method:\n" ,
                                    "1. Heat oil in a pan or wok over medium heat. Add garlic, ginger, and green onions, and stir-fry for a minute.\n" +
                                    "2. Add mashed black beans and chili bean sauce. Stir-fry for another minute.\n" +
                                    "3. Add eggplant cubes and stir-fry until softened.\n" +
                                    "4. Stir in vegetable broth, soy sauce, and sugar. Simmer for a few minutes.\n" +
                                    "5. Stir in the cornstarch mixture and cook until the sauce thickens.\n" +
                                    "6. Serve hot over steamed rice.",
                            R.drawable.mapo));
                    recipes.add(new Recipes("Kung Pao Tofu",
                            "Ingredients\n1 block of firm tofu, cubed\n" +
                                    "2 tablespoons vegetable oil\n" +
                                    "1/2 cup peanuts\n" +
                                    "2 cloves garlic, minced\n" +
                                    "1 tablespoon ginger, minced\n" +
                                    "2 green onions, chopped\n" +
                                    "2 tablespoons soy sauce\n" +
                                    "1 tablespoon rice vinegar\n" +
                                    "1 tablespoon hoisin sauce\n" +
                                    "1 teaspoon sugar\n" +
                                    "1 teaspoon cornstarch dissolved in 2 tablespoons water",
                            "Method:\n" ,
                                    "1. Heat oil in a wok or pan over medium heat. Add tofu cubes and fry until golden brown. Remove and set aside.\n" +
                                    "2. In the same pan, add peanuts and stir-fry until lightly toasted. Remove and set aside.\n" +
                                    "3. Add garlic, ginger, and green onions to the pan and stir-fry for a minute.\n" +
                                    "4. Add soy sauce, rice vinegar, hoisin sauce, and sugar. Stir well.\n" +
                                    "5. Return the tofu and peanuts to the pan. Stir in the cornstarch mixture and cook until the sauce thickens.\n" +
                                    "6. Serve hot over steamed rice.",
                            R.drawable.kung));
                    recipes.add(new Recipes("General Tso's Cauliflower",
                            "Ingredients\n1 medium cauliflower, cut into florets\n" +
                                    "1/2 cup all-purpose flour\n" +
                                    "1/2 cup cornstarch\n" +
                                    "1/2 teaspoon salt\n" +
                                    "1/2 teaspoon black pepper\n" +
                                    "Vegetable oil, for frying\n" +
                                    "2 tablespoons vegetable oil\n" +
                                    "2 cloves garlic, minced\n" +
                                    "1 tablespoon ginger, minced\n" +
                                    "2 green onions, chopped\n" +
                                    "1/4 cup soy sauce\n" +
                                    "2 tablespoons rice vinegar\n" +
                                    "2 tablespoons hoisin sauce\n" +
                                    "2 tablespoons sugar\n" +
                                    "1 teaspoon cornstarch dissolved in 2 tablespoons water",
                            "Method:\n" ,
                                    "1. In a bowl, combine flour, cornstarch, salt, and black pepper. Toss cauliflower florets in the flour mixture until coated.\n" +
                                    "2. Heat vegetable oil in a deep pan or wok over medium-high heat. Fry the cauliflower in batches until golden brown and crispy. Drain on paper towels.\n" +
                                    "3. In another pan, heat 2 tablespoons of vegetable oil over medium heat. Add garlic, ginger, and green onions, and stir-fry for a minute.\n" +
                                    "4. Add soy sauce, rice vinegar, hoisin sauce, and sugar. Stir well.\n" +
                                    "5. Stir in the cornstarch mixture and cook until the sauce thickens.\n" +
                                    "6. Add the fried cauliflower to the sauce and toss to coat.\n" +
                                    "7. Serve hot as a main dish or with steamed rice.",
                            R.drawable.cauli));

                    break;
            }
        }
                myrecyclerView = (RecyclerView) findViewById(R.id.recyclerView_id);

                myAdapter = new RecyclerViewAdapter(this, recipes);

                myrecyclerView.setLayoutManager(new GridLayoutManager(this, 1));

                myrecyclerView.setAdapter(myAdapter);

    }
}

