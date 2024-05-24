#Breach Bot Starter Code
breachYear = 2019

#Greets user
print("Hello! I'm Breach Bot.")
userName = input("What is your name?\n")
print("Nice to meet you " + userName)

#Recounts year of breach
todaysYear = input("What year is it?\n")
timePassed = int(todaysYear) - breachYear
print("Wow! That means it has been " + str(timePassed) + " years since the Facebook Data Breach.")



#Introduces breach
print("Would you like to learn about the Facebook Data 2019 Breach?")
giveInfo = input("Type 'yes' or 'no'\n")

#Explains breach
while giveInfo.lower() == "yes":
  print("What would you like to learn more about? Enter the lowercase letter of the following options: \n(a) breach details, (b) organization's response, or (c) I would like to hear your reflection")
  topic = input()
  
  if topic.lower() == "a":
    print("Personal information of 533 million users was stolen from Facebook’s database including full names, phone numbers, email addresses, and locations. The hack was by unname 'malicious actors' that had gotten the private data by exploiting a vulnerability on the platform that permitted users to connect and find each other by phone numbers.")
  
  elif topic.lower() == "b":
    print("Facebook found and fixed the issue in August 2019, and they also reached a $5 billion settlement in July 2019 with the US Federal Trade Commission because of the violation of an agreement they had with the agency on protecting user privacy. Facebook decided to not notify any users, and they encouraged users to check if their personal information was leaked in the breach by checking the data tracking tool HaveIBeenPwnd.")
  
  elif topic.lower() == "c":
    break
  
  else:
    print("Sorry, I didn't catch that. Choose one of the options listed.")
  
  input("Press enter to continue\n")


#Introduces my take
print("\nI'm excited to share my perspective with you. Are you ready to hear my take?")
giveInfo = input("Type 'yes' or 'no'\n")

#Shares my take
while giveInfo.lower() == "yes":
  print("What would you like to learn more about? Enter the lowercase letter of the following options: \n(a) relation to the CIA Triad, (b) my reaction, (c) my advice, or (d) none")
  topic = input()

  if topic.lower() == "a":
    print("This data breach connects to availability because Facebook had found and fixed the breach in August of 2019 to ensure and improve their security.")

  elif topic.lower() == "b":
    print("I disagree with the organization’s response because I think Facebook should have alerted their users right away that there was a breach in order to ensure that their users could have been notified and aware of what was happening.")

  elif topic.lower() == "c":
    print("I would convince victims to take action by saying that personal information and specifically phone numbers include the use of two-factor authentication via phone calls and text messages to verify someone’s identity, and this information can be used to steal their identity and other personal information. My advice would be to check HaveIBeenPwned to see if their personal data was affected by the breach and also encourage them to change the phone number and any other accounts that use the same passwords.")

  elif topic.lower() == "d":
    break

  else:
    print("Sorry, I didn't catch that. Choose one of the options listed.")

  input("Press enter to continue\n")

#Chatbot ends conversation
print("Thanks for chatting with me, and I hope you learned something new!")