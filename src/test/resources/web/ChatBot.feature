Feature: Chat Bot

  Scenario: Check The Chat Bot Flow
    Given User Launch "chrome" Browser
    When User Opens URL "https://bot.hitee.chat/botname/hola"
    And Click On Bot Icon
    Then Validate The More Option Buttons
    Then Validate The Language Selection Options
    Then Validate The Greeting Text With Following Buttons
    Then Validate Text Field With Microphone Symbol And Send Button
    And Click On Know More About Policies And Validate bot dialog with the Carousels, Get quote and No thanks buttons
    Then Validate Text Field With Microphone Symbol And Send Button
    And Click On No Thanks Button And Validate bot dialog along with Main Menu and Rate your experience buttons
    Then Validate Text Field With Microphone Symbol And Send Button
    And Click On Rate Your Experience Button And Validate bot dialog and Emoji along with text field and submit button
    And Click On Any Emoji As Per Experience
    And Click On Submit Button
    Then Validate Bot Dialog According To The Emoji
    Then Validate The More Option Buttons
    And Click On Home Button
    Then Validate The Greeting Text With Following Buttons
    Then Validate Text Field With Microphone Symbol And Send Button
#    And Click On Know More About Policies And Validate bot dialog with the Carousels, Get quote and No thanks buttons
    And Click On Know More About Policies
    And Click On Get Quote Button
    Then Validate Bot Dialog And Product Name Dropdown
    And Click On Product Name Dropdown
    And Click On Any Required Product Name Radio Button
    And Click On Product Type Dropdown
    And Click On Any Required Product Type Radio Button
    And Click On Submit Button
    Then Validate Bot Dialog With Slider By Default INR 1 Lakhs Should Be Selected, Tenure Required Dropdown And Submit Button
    And Drag The Slider According To The Required Insured Sum
    And Click on Tenure Required drop down
    And Select required tenure year
    And Click On Submit Button
    Then Validate The Bot Message Eldest member age Members slider Yes and No radio buttons
    And Enter "aa" character in member age And validate "Please enter only numbers" message
    And Enter "$$" Special characters in Member age And validate "Please enter only numbers" message
    And Enter "0" Zeros in member age And validate "Please maintain exactly 2 characters" message
    And Enter one digit and one alphabet "1A" in members age And validate "Please enter only numbers" message
    And Enter one digit and one special character "1*" in members age And validate "Please enter only numbers" message
    And Enter age value with "<111>" three digits in member age
    And Drag Slider as per the members present
    And Click any radio button for the ongoing medical conditions
    And Click On Submit Button
    Then Validate submitted details greeting message for buying a product with the quoted amount and connect to agent button
    Then Validate Text Field With Microphone Symbol And Send Button
    And Click on connect with agent button
    And Click on Chat with our agent
    Then Validate The More Option Buttons
    And Click On Home Button
    Then Validate The Greeting Text With Following Buttons
    Then Validate Text Field With Microphone Symbol And Send Button
#    And Click On Know More About Policies And Validate bot dialog with the Carousels, Get quote and No thanks buttons
    And Click On Know More About Policies
    And Click On Get Quote Button
    Then Validate Bot Dialog And Product Name Dropdown
    And Click On Product Name Dropdown
    And Click On Any Required Product Name Radio Button
    And Click On Product Type Dropdown
    And Click On Any Required Product Type Radio Button
    And Click On Submit Button
    Then Validate Bot Dialog With Slider By Default INR 1 Lakhs Should Be Selected, Tenure Required Dropdown And Submit Button
    And Drag The Slider According To The Required Insured Sum
    And Click on Tenure Required drop down
    And Select required tenure year
    And Click On Submit Button
    Then Validate The Bot Message Eldest member age Members slider Yes and No radio buttons
    And Enter age value with "<111>" three digits in member age
    And Drag Slider as per the members present
    And Click any radio button for the ongoing medical conditions
    And Click On Submit Button
    Then Validate submitted details greeting message for buying a product with the quoted amount and connect to agent button
    Then Validate Text Field With Microphone Symbol And Send Button
    And Click on connect with agent button
    And Click on video appoint button
    And Click on connect button
    And Click on No button
    And Click on connect button
    And Click on Yes btton
    And Click on close icon
    And Click On Main Menu
    Then Validate The Greeting Text With Following Buttons
    Then Validate Text Field With Microphone Symbol And Send Button
#    And Click On Know More About Policies And Validate bot dialog with the Carousels, Get quote and No thanks buttons
    And Click On Know More About Policies
    And Click On Get Quote Button
    Then Validate Bot Dialog And Product Name Dropdown
    And Click On Product Name Dropdown
    And Click On Any Required Product Name Radio Button
    And Click On Product Type Dropdown
    And Click On Any Required Product Type Radio Button
    And Click On Submit Button
#    Then Validate Bot Dialog With Slider By Default INR 1 Lakhs Should Be Selected, Tenure Required Dropdown And Submit Button
    Then Validate The Autopopulated Values Of sum insured and policy period Screen
#    And Drag The Slider According To The Required Insured Sum
#    And Click on Tenure Required drop down
#    And Select required tenure year
    And Click On Submit Button
    Then Validate The Bot Message Eldest member age Members slider Yes and No radio buttons
    Then Validate All the Autopopulated Fields of additional details Screen
#    And Enter age value with "<111>" three digits in member age
#    And Drag Slider as per the members present
#    And Click any radio button for the ongoing medical conditions
    And Click On Submit Button
    Then Validate submitted details greeting message for buying a product with the quoted amount and connect to agent button
    Then Validate Text Field With Microphone Symbol And Send Button
    And Click on connect with agent button
    And Click on Book appointment button
    And Provide "Pushkar" in name field
    And Provide "7768076656" phone number
    And Provide "pushkar@jsadh.ksjf" valid email id
    And Click On Submit Button
    And Click on calendar icon
    And Select required date and time
    And Click On Submit Button
    And Click On Main Menu
    Then Validate The Greeting Text With Following Buttons
    Then Validate Text Field With Microphone Symbol And Send Button
    And Click on Buy Insurance button
#    And Provide "Pushkar" in name field
#    And Provide "7768076656" phone number
#    And Provide "pushkar@jsadh.ksjf" valid email id
    And Click on Validate Mobile Number button
    And Enter received OTP
    And Click on validate button
    And Click on Health insurance button
    And Click on Insurance type drop down
    And Select required Insurance type
    And Click On Submit Button
    And Click on Self
    And Click on scrolling icon
    And Select required product and click on Add button
    And Click On Submit Button
    And Click on pay button
#    And Click on Phone number filed
#    And Enter valid phone number "7768076656"
#    And Click on Email field
#    And Enter valid mail id "test@asdf.asd"
#    And Click on Proceed button
#    And Click on Card
    Then Validate The More Option Buttons
    And Click On Home Button
    Then Validate The Greeting Text With Following Buttons
    Then Validate Text Field With Microphone Symbol And Send Button
    And Click on Renew policy button
    And Provide "Pushkar" in name field for Renew Policy
    And Provide "pushkar@jsadh.ksjf" valid email id for Renew Policy
    And Provide "7768076656" phone number for Renew Policy
    And Click on Validate Mobile Number button
    And Enter received OTP
#    Then Validate bot dialog with the existing policies and their details along with yes or no buttons
    Then Validate Text Field With Microphone Symbol And Send Button
    And Click on Yes button
    And Select required product and click on Add button For Renew
    And Click On Submit Button
  #  And Click on No button
    Then Validate The More Option Buttons
    And Click On Home Button
    Then Validate The Greeting Text With Following Buttons
    Then Validate Text Field With Microphone Symbol And Send Button
    And Click on Check claim status
    #Then Validate Text Field With Microphone Symbol And Send Button
    And Enter invalid claim id with characters "ABCD"
    And Enter invalid claim id "20003112"
    And Click on No button in claim status
    And Click On Main Menu
    Then Validate The Greeting Text With Following Buttons
    Then Validate Text Field With Microphone Symbol And Send Button
    And Click on Check claim status
    And Enter invalid claim id "20003115"
    And Click on Yes button for upload file
    And Click on Upload Button
    And Click on cancel
    And Click on Upload Button
    And Click on upload button to upload the file
    And Click on select file
    And Select any Image file and click on upload
    And Click on Delete icon on the uploaded file
    And Click on No button
    And Click on Delete icon on the uploaded file
    And Click on Yes
    And Click on select file
    And Select any document (Word or excel) file and click on upload
    And Click on select file
    And Click on any PDF document and click on upload button


    






