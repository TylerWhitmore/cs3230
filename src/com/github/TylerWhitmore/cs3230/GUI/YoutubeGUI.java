package com.github.TylerWhitmore.cs3230.GUI;

import com.github.TylerWhitmore.cs3230.GUI.Models.Result;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

//AIzaSyASnLP93xb2mlh-7-F6lg-7HNlso7mrB_c
public class YoutubeGUI {
    private JPanel rootPanel;
    private JTextField searchField;
    private JButton searchBtn;
    private JPanel searchPanel;
    private JScrollPane contentPanel;
    private HttpClient client = new HttpClient();

    public YoutubeGUI() {
        searchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result result = client.getResult("");
                try {
                    //something like this
                    URL imageUrl = new URL(/*result.getUrl()*/);
                    BufferedImage image = ImageIO.read(imageUrl);
                    contentPanel.setIcon(new ImageIcon(image));
                }
                catch (IOException malformedURLException){
                    malformedURLException.printStackTrace();
                }
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public static void main(String[] args) throws IOException {

    }
}
