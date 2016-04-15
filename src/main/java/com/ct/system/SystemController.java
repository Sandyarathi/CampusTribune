package com.ct.system;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ct.objects.Event;
import com.ct.objects.Post;
import com.ct.objects.User;
import com.ct.system.frontpage.FrontPageService;
import com.ct.system.notify.NotificationService;
import com.ct.system.recommend.RecommendationService;
import com.ct.system.search.SearchService;
import com.ct.system.spam.SpamControl;
@RestController
public class SystemController {
	FrontPageService frontPageService= new FrontPageService();
	SearchService searchService = new SearchService();
	RecommendationService recommendationService = new RecommendationService();
	NotificationService notificationService = new NotificationService();
	SpamControl spamControl= new SpamControl();
	
	@RequestMapping(value = "/posts/top", method = RequestMethod.GET)
    public List<Post> getTopPosts() {
      return frontPageService.getTopPosts();
    }
	
	@RequestMapping(value = "/events/top", method = RequestMethod.GET)
    public List<Event> getTopEvents() {
      return frontPageService.getTopEvents();
    }
	
	@RequestMapping(value = "/posts/search/{keywords}", method = RequestMethod.GET)
    public List<Post> getPostSearchResults(@PathVariable("keywords") String keywords) {
      return searchService.getPostSearchResults(keywords);
    }
	
	@RequestMapping(value = "/events/search/{keywords}", method = RequestMethod.GET)
    public List<Event> getEventSearchResults(@PathVariable("keywords") String keywords) {
      return searchService.getEventSearchResults(keywords);
    }
	
	public void createRecommendations(int user_id){
		recommendationService.createRecommendations(user_id);
		
	}
	
	public void createNotifications(int user_id){
		notificationService.createNotifications(user_id);
		
	}
	
	public boolean isTextSpam (String textContent){
		return spamControl.isTextSpam(textContent);
	}
	public boolean isURLSpam (String urlContent){
		spamControl.isURLSpam(urlContent);
		return spamControl.isTextSpam(urlContent);
	}
	
	
	
	

}
