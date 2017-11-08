public class ProfileNotReviewedException extends Exception
{
        public ProfileNotReviewedException(String message)
        {
                System.out.println("The profile is not reviewed yet!");
                if (message != null)
                        System.out.println("Remarks: " + message);
        }
}
