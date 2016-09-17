package nyc.c4q.ramonaharrison;

import nyc.c4q.ramonaharrison.network.Slack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {

            Bot myBot = new Bot();
//        myBot.whoIsThisUser("U238CFFLK");

//        myBot.testApi();

//        myBot.listChannels();

//        myBot.listMessages(Slack.BOTS_CHANNEL_ID);
            myBot.checkMessages(Slack.BOTS_CHANNEL_ID);
//        }

            // Post "Hello, world!" to the #bots channel
//        myBot.sendMessageToBotsChannel("can I post in this channel & in my private channel?");
            // Post to #messbotsquad
//        myBot.sendMessage("can I post in this channel & in my private channel?");
            // Post a pineapple photo to the #bots channel
//        myBot.sendMessage("http://weknowyourdreams.com/images/pineapple/pineapple-07.jpg");


//        }
        }
    }
}