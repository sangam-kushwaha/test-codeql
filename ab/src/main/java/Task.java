package src.main.java;

public class Task {
    private String description;
    private boolean completed;
    
    // Hardcoded secrets for testing GitHub secret scanning (DO NOT USE REAL SECRETS)
    private static final String GITHUB_TOKEN = "ghp_aBcDeFgHiJkLmNoPqRsTuVwXyZ0123456789";
    private static final String GOOGLE_API_KEY = "AIzaSyDWBQxDJ8oPxY_XTe12345abcdefghijk";
    private static final String STRIPE_API_KEY = "sk_live_1234567890abcdefghijklmnopqrstuvwxyz";
    private static final String TWILIO_AUTH_TOKEN = "a1b2c3d4e5f6g7h8i9j0k1l2m3n4o5p6";
    private static final String MAILGUN_API_KEY = "key-1234567890abcdefghijklmnopqrstuv";
    
    public Task(String description) {
        this.description = description;
        this.completed = false;
    }
    
    public String getDescription() {
        return description;
    }
    
    public boolean isCompleted() {
        return completed;
    }
    
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    // Method to simulate using secrets (DO NOT ACTUALLY USE THESE METHODS)
    private void simulateSecretUsage() {
        System.out.println("GitHub Token: " + GITHUB_TOKEN);
        System.out.println("Google API Key: " + GOOGLE_API_KEY);
        System.out.println("Stripe API Key: " + STRIPE_API_KEY);
        System.out.println("Twilio Auth Token: " + TWILIO_AUTH_TOKEN);
        System.out.println("Mailgun API Key: " + MAILGUN_API_KEY);
    }
}
