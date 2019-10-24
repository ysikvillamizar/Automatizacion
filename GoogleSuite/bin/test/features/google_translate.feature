#Author: your.email@your.domain.com

Feature: Google Translate
 As a web user 
 I want to use google Translate
 to translate words between different languages


  Scenario: Translate from English to Spanish
    Given that Susan wants to translate a word
    When she translates the word cheese from English to Spanish
    Then she should see the word queso in the screen
    
   
   #that_Susan_wants_to_translate_a_word()-->Underscore
    #thatSusanWantsToTranslateAWord--> Camel

