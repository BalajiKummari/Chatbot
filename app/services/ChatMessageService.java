package services;

import com.google.inject.Inject;
import models.ChatMessage;
import models.User;
import repositories.ChatRepository;
import repositories.UserRepository;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ChatMessageService {

    @Inject
    UserRepository userRepository;

    @Inject
    ChatRepository chatRepository;

    static List<String> greetingFunctions = Arrays.asList("hi", "hello", "hola");
    static List<String> sendingOffFunctions = Arrays.asList("bye", "see you");

    public List<ChatMessage> getAllByUser(String username) {
        User user = userRepository.findByName(username);
        List<ChatMessage> chatMessages =  chatRepository.findByUserId(user.get_id());
        return chatMessages.stream().sorted(Comparator.comparing(ChatMessage::getSentTime)).collect(Collectors.toList());
    }

    public void saveResponseForMessage(String username, String message) {
        User user = userRepository.findByName(username);
        String response = getResponseForMessage(message, username);
        ChatMessage chatMessage = new ChatMessage(response, "Bot", System.currentTimeMillis(), user.get_id());
        chatRepository.save(chatMessage);
    }

    public String getResponseForMessage(String message, String username) {
        for (String greeting : greetingFunctions) {
            if (message.toLowerCase().contains(greeting)) {
                return "Hello ".concat(username).concat("!!!");
            }
        }

        for (String sendOff : sendingOffFunctions) {
            if (message.toLowerCase().contains(sendOff)) {
                return "Thank you, ".concat(username);
            }
        }

        if(message.equals("How many leaves do I have")){
            return "12 casual leaves and 12 sick leaves";
        }

        if(message.equals("Can the sick leaves and casual leaves be clubbed")){
            return "No, they can't be clubbed";
        }

        if(message.equals("Can the leaves be carried forward")){
            return "The casual leaves can be carried forward, but the sick leaves cannot be carried forward.";
        }

        if(message.equals("How many unpaid leaves per a month")){
            return "One sick leave and one casual leave";
        }

        if(message.equals("What causes the deduction of half day leave")){
            return "Being late beyond the grace time for 3 times causes a deduction of your half day leave";
        }






        return "Sorry, I didn't get that";
    }

    public void saveUserMessage(String username, String message) {
        User user = userRepository.findByName(username);
        ChatMessage chatMessage = new ChatMessage(message, username, System.currentTimeMillis(), user.get_id());
        chatRepository.save(chatMessage);
    }

}
