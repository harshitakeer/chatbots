public class ChatterBot{ //needs to match file name exactly

  private String name; //instance variable 
  //default strings and objects are set to Null
  // private int age;



  //METHODS
  public String askName(){
    return "Hey there! What's your name?\n";
  }

  // public String askAge(){
  //   return "What is your age?";
  // }

  public String intro(){
    return "I'm Chip, your Chipotle Chatbot, here to add a little extra flavor to your day! Whether you're craving a delicious burrito or a nice, cool drink, I'm here to help navigate our sizzling menu and answer any questions or concerns you may have. Just say the word, and we can get this fiesta started! If you need to head out at any point, no worries, just simply type 'Bye', and we'll get the hint. Now, let's 'taco' bout your next meal!\n";
  }
  
  //GETTERS
  public String getName(){
    return name;
  }

  // public int getAge(){
  //   return age;
  // }


  
  //SETTERS  
  public void setName(String n){
    name = n;
  }

  // public void setAge(int a){
  //   age = a;
  // }


  //ARRAY METHODS
  String[] cleanlinessKey = {"cleanliness standards", "hygiene practices", "sanitation measures", "health and safety", "clean", "hygiene", "sanitation"};
  
  String[] customerServiceKey = {"customer service", "issue resolution", "complaints", "contacting us", "service", "complaint"};

  String[] paymentKey = {"payment options", "credit card", "cash", "contactless payment", "pay", "check", "buy"};

  String[] specialsKey = {"promotions", "special deals", "discounts", "limited-time offers"};

  String[] allergiesKey = {"allergies", "gluten-free", "vegan", "vegetarian", "dietary restrictions"}; 
  
  String[] greenKey = {"sustainable", "climate", "sustainability", "green", "environment", "environmental", "environmentally", "environmentally friendly"};

  String[] helpKey = {"confused", "help", "trouble", "difficulty", "problem"}; 
  
  String[] menuKey = {"menu", "food", "menus","order", "burrito", "burritos", "tacos", "taco", "burrito bowl", "burrito bowls", "salad", "salads"};

  String[] cateringKey = {"catering", "party", "event", "planning"};

  String[] hoursKey = {"timing", "open", "close", "days", "hours", "availability", "time"};

  String[] phoneKey = {"phone", "number", "contact", "reach out", "call", "phone number"};
  
  String[] thanksKey = {"thanks", "thank you", "thank", "appreciate", "appreciate it", "awesome"};

  String[] greetingsKey = {"hi", "hello", "hey", "greetings", "whats up"};

  String[] ingredientsKey = {"ingredient", "vegetables", "produce", "meat", "chicken", "fish", "seafood", "bread", "rice", "ingredients"}; 

  String[] saucesKey = {"sauce", "sauces", "salsa", "guac", "guacamole", "queso", "cheese"};

  String[] drinksKey = {"drink", "drinks", "beverages", "beverage", "drinks?"};

  String [] rewardsKey = {"discounts", " offers", "coupons", "rewards", "loyalty program", "specials", "offer", "discount", "coupon", "reward"};

  String [] nutritionKey = {"nutrition", "calories", "allergies", "allergic", "gluten", "vegan", "vegetarian", "dietary", "diet", "nutritional info", "calorie count"};

  String [] storeKey = {"store locator", "nearest store", "find store", "Chipotle near me", "directions to store", "store address", "local Chipotle", "store map", "location finder", "store", "near me"};

  String[] orderKey = {"online order", "order tracking", "delivery options", "order delivery status", "track my order", "delivery estimate", "order confirmation", "food delivery", "order number"};


public void userInput(String response){
      if (betterSearch(response, greetingsKey) == true){
        System.out.println("\nHey there, I'm  Chip,  your flavor guide and burrito buddy! I'm here to help spice up your experience at Chipotle, so let me know if you have any questions! What brings you to our virtual salsa bar?\n");
      }
      else if(betterSearch(response, greenKey) == true){
         System.out.println("\nYou're speaking my language, nice! At Chipotle, we're passion about our imprint on the planet, just like our guacamole is passionate about being flavorful. Some of our impact includes diverting 50% of our waste from landfills in 2021, and our goal for this year is to reduce our greenhouse gas emissions by 50%. We believe it is important to source our ingredients that are not only fresh but also grown responsibly. We are committed to sustainable practices such as supporting local farmers, reducing our carbon footprint, embracing organic produce — all one burrito at a time. If you have specific green-coded questions and need more details, I highly recommend checking out Chipotle's section on sustainability, @ https://www.chipotle.com/values! If you have any other queries, I would be ecstatic to help out!\n");
      }
      else if(betterSearch(response, helpKey) == true){
           System.out.println("\nLooks like you need a helping hand, or should I say a helping burrito? Well either way, you've asked the right bot! Whether you need help navigating our snazzy menu or just want to know more about Chipotle, I've got all the sauce (and answers). Tell me what's cooking, and I'll whip up a solution right away!\n");
        }
      else if(betterSearch(response, menuKey) == true){
           System.out.println("\nI'm so glad you asked, this is my favorite question! Our menu is a vibrant list of fresh ingredients, sizzling flavors, and bold sauces, all waiting to be crafted into your perfect meal! From bowls overflowing with love and burritos large enough to wrap you in a warm hug, we have a plethora of choices offered to you! Chiptole offers you the freedom to mix and match your own flavorful masterpiece, and it's only a touch away! Choose from our options of burritos, burrito bowls, salads, tacos, beverages, spicy sauces, and even chips + dip to fulfill your taste buds! If you want to know more about our ingredients, sauces, or drinks, ask away! You can also check out @ https://www.chipotle.com/#menu, but I would love to keep talking to you!\n");
        }
      else if(betterSearch(response, cateringKey) == true){
           System.out.println("\nPlanning a feast for a crowd? I'm glad you chose me to help! From family reunions needing a dash of flavor and office meetings craving a sprinkle of spice, we've got numerous options to fulfill everyone's desire. You can choose from services like the Build-Your-Own Taco Bar or even the Burrito Bowl Spread, all served with fresh ingredients and flavorful sauces. I am so delighted to help make your event the talk of the town, with food that's as memorable as the occasion itself. If you need more specific information, check out @ https://catering.chipotle.com. In the meanwhile, I would be delighted to answer any questions you may have about our menu or drinks!\n");
        }
      else if(betterSearch(response, hoursKey) == true){
          System.out.println("\nLooking for when you can come in and munch on some yummy burritos or tasty tacos? Awesome timing! Our doors are swing open at 11 A.M., ready to serve you with the aroma of fresh ingredients and taste of bold sauces. As much as it sucks, we wrap things up (like a burrito) at 10 P.M, giving you plenty of time to satisfy your Chipotle cravings. So, whether you're an early bird or night owl looking for some tasty delights, we are here for you. If you're unsure what to get, I would be delighted to give you information on our menu! Let me know, and I will enlighten you with all our delicious items!\n");
        }
      else if(betterSearch(response, phoneKey) == true){
          System.out.println("\nGot a question that needs the voice of a human? No worries, I am not offended. You can dial up the flavor hotline at (925)-426-0052, where our friendly crew is ready to tackle all questions, including salsa secrets and menu mysteries! We're just a call away, waiting to sprinkle our Chipotle magic into your day! And, even better, if you are digital at heat, I'm always here to chat with you 24/7! So, on that note, what's up? How can I assist you further?\n");
        }
      else if(betterSearch(response, thanksKey) == true){
          System.out.println("\nYou are so welcome! Helping you is as exciting as rolling a perfect burrito! I am always here for you, ready to dive into some snazzy salsa or climb a mountain of guac to assist you! If you have another question, need more info, or simply want to chat about our delicious options, hit me up. Until then, keep spreading those good vibes like our famous Chipotle Sauce!\n");
        }
      else if(betterSearch(response, ingredientsKey) == true){
          System.out.println("\nOh gosh, you are diving into the endless realms of our kichen, which houses the freshest, finest ingredients! At Chipotle, we are proud of our farm-to-taco journey, inlcuding only responsibly sourced produce, naturally-raised meat, and snazzy flavors that dance on your tongue! We offer hand scooped avacados, fire-roasted peppers, and even beans simmered to perfection. Chipotle values diversity in its ingredients, with 53 REAL ingredients! Curious about all these 53 ingredients? I recommened checking out our lovely page @ https://www.chipotle.com/ingredients, where all our ingredients are ones you can recognize, and yes, pronounce. If you have more inquries about what we offer, I'd be stoked to answer questions about our menu!\n");
        }
      else if(betterSearch(response, saucesKey) == true){
          System.out.println("\nOh my gosh, ready to dive into a world of salient sauces? Our sauces are the secret heros of each and every meal. Every sauce we offer, from our creamy guacamole to our smoky chipotle salsa, is crafted to add that extra taste to your meal! There's a blend for every preferences, whether that be a preference for our pico de gallo or our hot tomatillo-red chili salsa! Looking for more options to complement your veggie bowl or chicken burrito? Check out @ https://www.chipotle.com/#menu! If your looking for a cool beverage to go along with your flavorful meal, don't hesitate to ask!\n");
        }
      else if(betterSearch(response, drinksKey) == true){
          System.out.println("\nThirsty for something refreshing? You've come to the right bot! At Chiptole, every meal deserves their perefect sidekick - a nice, cool beverage. From classic sodas such as Sprite and Coke to organic fruit juices, we have a sip for every kind of Chiptole trip! Whether you're craving one of our legendary margaritas or a cool,fizzy pop to supplement your tangy taco or spicy burrito, we got your pour covered. Want to look at some tasty possibilities? Check out @https://www.chipotle.com/#menu, and in the meantime feel free to ask me anything else about our menu!\n");
        }
    else if(betterSearch(response, rewardsKey) == true){
      System.out.println("\nOh! Talking about rewards? Now you're talking my language! Our Chipotle Rewards program is like a burrito bowl of benefits, where every bite gets you closer to mouth-watering rewards. Envision this: free guac, sizzling entrees, and exclusive perks. Just starting your Chipotle rewards journey or ready to cash in your hard-earned points? Check out @ https://www.chipotle.com/rewards and unwrap all the details! Wondering what free meel you want to indulge in? Feel free to ask about our menu or the snazzy beverages we offer!\n");
      }
    else if(betterSearch(response, nutritionKey) == true){
      System.out.println("\nCraving some Chipotle but want to keep it nutritious? I totally understand. Whether you're counting calories, avoiding allergens, or trying to stick to a vegan or gluten-free diet, we have it all! Here at Chipotle, we understand the preference for a meal with your choice of nutrition! Want to find out all details about the nutrition and calories in your next meal? Don't worry, @https://www.chipotle.com/nutrition-calculator has you covered! If you need help navigating our menu as well, reach out!\n");
      }
    else if(betterSearch(response, storeKey) == true){
      System.out.println("\nLooking for your Chipotle's nearest flavor paradise? Check out @ https://www.chipotle.com and click on the location icon to find your nearest burrito heaven! If you need the rundown and store hours or contact information, I've got all the deets. Ask away!\n");
      }
    else if(betterSearch(response, orderKey) == true){
      System.out.println("\nOn a time crunch and don't have enough time to order in-person? No worries, Chipotle has you covered. Whether you need your flavorful meal delivered or picked up, we got you covered! Head over to @ https://www.chipotle.com/#menu and order now! If you have any questions about our menu or what we offer, don't hesistate to ask! I'm here to make your Chipotle experience as smooth as our famous guac!\n");
      }
    else if(betterSearch(response, allergiesKey) == true){
      System.out.println("\nWe take dietary restrictions and food allergies seriously! Our menu includes options that cater to various dietary needs, such as gluten-free, vegan, and vegetarian preferences. We are committed to providing a safe and enjoyable dining experience for all our guests. We want to ensure that our services are enjoyable to all!\n");
      }
  else if(betterSearch(response, specialsKey) == true){
      System.out.println("\nExplore our current promotions and limited-time offers to enjoy exclusive discounts and exciting deals! Trust me, their worth it. Our specials are designed to add value to your Chipotle experience. Check our website for the latest offers, @ https://www.chipotle.com!\n");
      }
  else if(betterSearch(response, paymentKey) == true){
      System.out.println("\nAt Chipotle, we offer various payment options, including credit cards, cash, and contactless methods, to ensure a seamless transaction process. Your convenience is our priority here at Chipotle! If you're unsure what meal we offer to satisfy your cravings, feel free to ask about our menu!\n");
  }
  else if(betterSearch(response, customerServiceKey) == true){
      System.out.println("\nYour satisfaction is our number one priority! If you have any issues or feedback, please contact our customer service team. We are dedicated to addressing your concerns and ensuring a positive experience. If you're unsure who to contact, feel free to ask me about our contact number! We want to make sure your time at Chipotle is as smooth as our guac!\n");
  }
  else if(betterSearch(response, cleanlinessKey) == true){
        System.out.println("\nWe uphold high standards of cleanliness and hygiene practices to provide a safe and welcoming environment for our guests! Your health and safety are paramount to us, and we take every measure to maintain a clean and tidy atmosphere!\n");
    }
      else{
        System.out.println(getRandomResponse());
      }
    } 


public static boolean betterSearch(String resp, String[] key){
    for (int i = 0; i < key.length; i++){
    int index = resp.indexOf(key[i]);
    if(index != -1){
      if (index == 0 || resp.charAt(index - 1) == (' ')){
        if (index + key[i].length() == resp.length() || resp.charAt(index + key[i].length()) == ' ' || resp.charAt(index + key[i].length()) == (',')||resp.charAt(index + key[i].length()) == '.'){ 
          return true;
    }      
    }
    }
  }
  return false;
  }

  
public static String getRandomResponse(){
      final int NUMBER_OF_RESPONSES = 8;
      double r = Math.random(); 
      int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
      String response = "";
      if (whichResponse == 0){
            return "I'm so sorry, I don't seem to understand. Can you try again at another time?";

        }
      else if (whichResponse == 1){
            response =  "\nHmmm, I'm a little lost. Can you elaborate?\n";
        }
      else if (whichResponse == 2){
             response = "\nSorry, I've lost track of your question. Can you explain further?\n";
        }
      else if (whichResponse == 3){
             response =  "\nMy bad, I'm a little confused. Can you ask again?\n";
        }
      else if (whichResponse == 4){
             response =  "\nI don't have enough information at the moment, but you can try again later!\n";
        }
      else if (whichResponse == 5){
              response = "\nI'm unable to understand your request, sorry! Would you like to try again?\n";
       }
      else if (whichResponse == 6){
              response = "\nI don't have the exact details right now, can you try asking again?\n";
       }
      else if (whichResponse == 7){
              response =  "\nRight now, I am not sure what the answer is. Can you expand?\n";
       }
  return response;
         }


}



  
