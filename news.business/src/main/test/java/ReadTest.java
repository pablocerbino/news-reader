import com.strepsis.RSS.RSSFeedParser;
import com.strepsis.reader.model.Feed;
import com.strepsis.reader.model.FeedMessage;

/**
 * Created by pcerbino on 13/02/17.
 */
public class ReadTest {
    public static void main(String[] args) {
        RSSFeedParser parser = new RSSFeedParser(
                "https://www.feedly.com/article.rss");
        Feed feed = parser.readFeed();
        System.out.println(feed);
        for (FeedMessage message : feed.getMessages()) {
            System.out.println(message);

        }

    }
}
