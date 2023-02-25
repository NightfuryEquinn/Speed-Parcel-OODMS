package oodms.oop;

public class FeedbackRating {
    public String getRating(int rating) {
        String theRating = switch (rating) {
            case 1 -> "Extremely Poor";
            case 2 -> "Below Average";
            case 3 -> "Mediocre";
            case 4 -> "Good";
            case 5 -> "Excellent";
            default -> "Extremely Poor";
        };
        
        return theRating;
    }
}
