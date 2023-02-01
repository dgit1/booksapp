package com.example.booksapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.booksapp.adapters.MyRecyclerViewAdapter;
import com.example.booksapp.databaseHelper.DataBaseHelper;
import com.example.booksapp.models.NewBookModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView all_books_rv, motivation_books_rv, biography_books_rv, history_books_rv, literature_books_rv, science_books_rv, fiction_books_rv;
    DataBaseHelper myDb;
    ArrayList<NewBookModel> bookModelArrayList = new ArrayList<>();

    ArrayList<NewBookModel> motivationList;
    ArrayList<NewBookModel> biographyList;
    ArrayList<NewBookModel> historyList;
    ArrayList<NewBookModel> arabicLiteratureList;
    ArrayList<NewBookModel> scienceList;
    ArrayList<NewBookModel> fictionList;


    private void addMotivationData() {
        NewBookModel bookModel1 = new NewBookModel();
        bookModel1.setBookName("Think and grow rich Arabic");
        bookModel1.setBookAuthor("Napoleon Hill");
        bookModel1.setBookDetails("Oliver Napoleon Hill (October 26, 1883 – November 8, 1970) was an American self-help author. He is best known for his book Think and Grow Rich (1937), which is among the best-selling self-help books of all time.Hill's works insisted that fervid expectations are essential to improving one's life. Most of his books were promoted as expounding principles to achieve success. Hill is, in modern times, a controversial figure. Accused of fraud, modern historians also doubt many of his claims, such as that he met Andrew Carnegie and that he was an attorney. Gizmodo has called him the most famous conman you've probably never heard of.");
        bookModel1.setBookCategory("Motivation");
        bookModel1.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2FNoor-Book.com%20%20%D9%81%D9%83%D8%B1%20%D9%88%D8%A7%D8%B2%D8%AF%D8%AF%20%D8%AB%D8%B1%D8%A7%D8%A1%20%D8%A7%D9%83%D8%AA%D8%B4%D9%81%20%D9%82%D9%88%D8%AA%D9%83%20%D8%A7%D9%84%D8%B3%D8%AD%D8%B1%D9%8A%D8%A9%20%D9%84%D8%AA%D8%B5%D8%A8%D8%AD%20%D8%AB%D8%B1%D9%8A%D8%A7%203%20.pdf?alt=media&token=33d24d4c-df8a-4456-9c3e-7b87187a7d92");
        bookModel1.setBookThumbnail("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/images%2Fthink_and_grow_rich.jpg?alt=media&token=f6a5c0f0-7bc1-4f2a-a2f1-c583caaf42a8");

        motivationList.add(bookModel1);

        NewBookModel bookModel2 = new NewBookModel();
        bookModel2.setBookName("The Power Of Your Subconscious Mind");
        bookModel2.setBookAuthor("Joseph Murphy");
        bookModel2.setBookDetails("The Power Of Your Subconscious Mind pdf free download. In the preface of this title, Dr Joseph Murphy asserts that life events are actually the result of the workings of your conscious and subconscious minds. He suggests practical techniques through which one can change one’s destiny, principally by focusing and redirecting this miraculous energy. Years of research studying the world’s major religions convinced him that some great Power lay behind all spiritual life and that this power is within each of us.");
        bookModel2.setBookCategory("Motivation");
        bookModel2.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2FThe-Power-Of-Your-Subconscious-Mind-pdf-free-download.pdf?alt=media&token=a397a0b7-dc9f-4a1b-815a-ca589dcb62f3");
        bookModel2.setBookThumbnail("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/images%2Funleash_power.jpg?alt=media&token=3b25d081-ecf5-4f0a-b58a-bae9d8246dda");

        motivationList.add(bookModel2);


        NewBookModel bookModel3 = new NewBookModel();
        bookModel3.setBookName("ThoughtFull Living");
        bookModel3.setBookAuthor("Napoleon Hill");
        bookModel3.setBookDetails("Oliver Napoleon Hill (October 26, 1883 – November 8, 1970) was an American self-help author. He is best known for his book Think and Grow Rich (1937), which is among the best-selling self-help books of all time.Hill's works insisted that fervid expectations are essential to improving one's life. Most of his books were promoted as expounding principles to achieve success. Hill is, in modern times, a controversial figure. Accused of fraud, modern historians also doubt many of his claims, such as that he met Andrew Carnegie and that he was an attorney. Gizmodo has called him the most famous conman you've probably never heard of.");
        bookModel3.setBookCategory("Motivation");
        bookModel3.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2FTruthful%20Living%20-%20The%20First%20Writings%20of%20Napoleon%20Hill%20(%20PDFDrive%20).pdf?alt=media&token=8542748b-ae94-4d40-9e8a-a254abb100be");
        bookModel3.setBookThumbnail("https://cdn.asaha.com/assets/thumbs/f27/f2707d24cf24dd48ec48cd8b2aa20575.jpg");

        motivationList.add(bookModel3);


        NewBookModel bookModel4 = new NewBookModel();
        bookModel4.setBookName("Rich Dad Poor Dad");
        bookModel4.setBookAuthor("Robert Toru Kiyosaki");
        bookModel4.setBookDetails("Robert Toru Kiyosaki (born April 8, 1947) is an American entrepreneur, businessman and author.Kiyosaki is the founder of Rich Global LLC and the Rich Dad Company, a private financial education company that provides personal finance and business education to people through books and videos. The company's main revenues come from franchisees of the Rich Dad seminars that are conducted by independent individuals using Kiyosaki's brand name for a fee. He is also the creator of the Cashflow board and software games to educate adults and children about business and financial concepts.");
        bookModel4.setBookCategory("Motivation");
        bookModel4.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2FRich%20Dad%20Poor%20Dad%20(%20PDFDrive%20).pdf?alt=media&token=6bb64803-9234-406a-9949-3a40343b2fe0");
        bookModel4.setBookThumbnail("https://cdn.asaha.com/assets/thumbs/29c/29c31e04c5e8eb202e16918b95c55351.jpg");

        motivationList.add(bookModel4);


        NewBookModel bookModel5 = new NewBookModel();
        bookModel5.setBookName("The Intelligent Investor");
        bookModel5.setBookAuthor("Benjamin Graham");
        bookModel5.setBookDetails("Benjamin Graham was a British-born American economist, professor and investor. He is widely known as the \"father of value investing\", and wrote two of the founding texts in neoclassical investing: Security Analysis (1934) with David Dodd, and The Intelligent Investor (1949). His investment philosophy stressed investor psychology, minimal debt, buy-and-hold investing, fundamental analysis, concentrated diversification, buying within the margin of safety, activist investing, and contrarian mindsets. After graduating from Columbia University at age 20, he started his career on Wall Street, eventually founding the Graham–Newman Partnership. After employing his former student Warren Buffett, he took up teaching positions at his alma mater, and later at UCLA Anderson School of Management at the University of California, Los Angeles.");
        bookModel5.setBookCategory("Motivation");
        bookModel5.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2FThe%20Intelligent%20Investor%20(%20PDFDrive%20).pdf?alt=media&token=ad4916e5-55e9-4edd-af02-2c8a81647433");
        bookModel5.setBookThumbnail("https://cdn.asaha.com/assets/thumbs/64b/64b94bc0f7ea4231a3d97731ee1a41fd.jpg");

        motivationList.add(bookModel5);


        NewBookModel bookModel6 = new NewBookModel();
        bookModel6.setBookName("Zero To One");
        bookModel6.setBookAuthor("Peter Thiel");
        bookModel6.setBookDetails("Peter Andreas Thiel is a German-American billionaire entrepreneur, venture capitalist, and political activist. A co-founder of PayPal, Palantir Technologies, and Founders Fund, he was the first outside investor in Facebook. As of May 2022, Thiel had an estimated net worth of $7.19 billion and was ranked 297th on the Bloomberg Billionaires Index. He worked as a securities lawyer at Sullivan & Cromwell, as a speechwriter for former U.S. Secretary of Education William Bennett and as a derivatives trader at Credit Suisse. He founded Thiel Capital Management in 1996. He co-founded PayPal with Max Levchin and Luke Nosek in 1998, serving as chief executive officer until its sale to eBay in 2002 for $1.5 billion.");
        bookModel6.setBookCategory("Motivation");
        bookModel6.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2FZero-to-One-Notes-on-Startups-or-How-to-Build-the-Future.pdf?alt=media&token=22b0dfd5-9cb2-4bba-9e0c-fc2164057e9e");
        bookModel6.setBookThumbnail("https://cdn.asaha.com/assets/thumbs/518/518e8a2c805d0074b824a9d5bc260b4b.jpg");

        motivationList.add(bookModel6);


        NewBookModel bookModel7 = new NewBookModel();
        bookModel7.setBookName("The 5 Second Rule");
        bookModel7.setBookAuthor("Mel Robbins");
        bookModel7.setBookDetails("Melanie Robbins October 6, 1968 is an American lawyer, television host, author, and motivational speaker. Robbins is known for covering the George Zimmerman trial for CNN her TEDx talk, How to Stop Screwing Yourself Over and her books The 5 Second Rule and The High 5 Habit. Prior to joining CNN as a legal analyst, Robbins worked as a criminal defense attorney and hosted Cox Media Group's The Mel Robbins Show, A&E's Monster In-Laws, and Fox's Someone's Gotta Go. In 2011, Robbins published Stop Saying You're Fine: Discover a More Powerful You. She spoke at TEDx San Francisco about a psychological trick that she termed the five second rule. Her talk, viewed more than 20 million times on YouTube as of August 2019, launched her public speaking career.");
        bookModel7.setBookCategory("Motivation");
        bookModel7.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2FThe%205%20Second%20Rule_%20Transform%20your%20Life%2C%20Work%2C%20and%20Confidence%20with%20Everyday%20Courage%20(%20PDFDrive%20).pdf?alt=media&token=4bf3b439-8b79-4f17-84dc-3028c33586ec");
        bookModel7.setBookThumbnail("https://cdn.asaha.com/assets/thumbs/52c/52cd4079b54f1fbcb5d6bc581a73618b.jpg");

        motivationList.add(bookModel7);

        NewBookModel bookModel8 = new NewBookModel();
        bookModel8.setBookName("Rich Dad Poor Dad Arabic");
        bookModel8.setBookAuthor("Robert Toru Kiyosaki");
        bookModel8.setBookDetails("Robert Toru Kiyosaki (born April 8, 1947) is an American entrepreneur, businessman and author.Kiyosaki is the founder of Rich Global LLC and the Rich Dad Company, a private financial education company that provides personal finance and business education to people through books and videos. The company's main revenues come from franchisees of the Rich Dad seminars that are conducted by independent individuals using Kiyosaki's brand name for a fee. He is also the creator of the Cashflow board and software games to educate adults and children about business and financial concepts.");
        bookModel8.setBookCategory("Motivation");
        bookModel8.setBookPDFLink("https://ia800805.us.archive.org/1/items/kuosaky/kuosaky.pdf");
        bookModel8.setBookThumbnail("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/images%2Frich_dad_arabic.jpg?alt=media&token=21355a09-bc14-44fd-b13c-815f81ef24c0");

        motivationList.add(bookModel8);

        NewBookModel bookModel9 = new NewBookModel();
        bookModel9.setBookName("Think and grow rich");
        bookModel9.setBookAuthor("Napoleon Hill");
        bookModel9.setBookDetails("Oliver Napoleon Hill (October 26, 1883 – November 8, 1970) was an American self-help author. He is best known for his book Think and Grow Rich (1937), which is among the best-selling self-help books of all time.Hill's works insisted that fervid expectations are essential to improving one's life. Most of his books were promoted as expounding principles to achieve success. Hill is, in modern times, a controversial figure. Accused of fraud, modern historians also doubt many of his claims, such as that he met Andrew Carnegie and that he was an attorney. Gizmodo has called him the most famous conman you've probably never heard of.");
        bookModel9.setBookCategory("Motivation");
        bookModel9.setBookPDFLink("https://apex.oracle.com/pls/apex/lonestar/r/files/static/v13Y/Think-And-Grow-Rich_2011-06.pdf");
        bookModel9.setBookThumbnail("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/images%2Fthink_and_grow.jpg?alt=media&token=c6497aef-56ab-43c5-87f5-52a91edbf364");

        motivationList.add(bookModel9);


        NewBookModel bookModel10 = new NewBookModel();
        bookModel10.setBookName("The Seven Habits of Highly Effective People");
        bookModel10.setBookAuthor("Stephen Richards");
        bookModel10.setBookDetails("Stephen Richards Covey (October 24, 1932 – July 16, 2012) was an American educator, author, businessman, and keynote speaker. His most popular book is The 7 Habits of Highly Effective People.His other books include First Things First, Principle-Centered Leadership, The 7 Habits of Highly Effective Families, The 8th Habit, and The Leader In Me: How Schools and Parents Around the World Are Inspiring Greatness, One Child at a Time. In 1996, Time magazine named him one of the 25 most influential people.He was a professor at the Jon M. Huntsman School of Business at Utah State University at the time of his death.");
        bookModel10.setBookCategory("Motivation");
        bookModel10.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2FSeven-habits-of-highly-effective-people.pdf?alt=media&token=fecc0f24-c9b0-4f2d-978f-0a1ce062a49c");
        bookModel10.setBookThumbnail("https://cdn.asaha.com/assets/thumbs/153/153fd5d9e53d1c09117cdc4638257546.jpg");

        motivationList.add(bookModel10);


    }

    private void addBiographyData() {
        NewBookModel bookModel1 = new NewBookModel();
        bookModel1.setBookName("Napoleon: A Biography");
        bookModel1.setBookAuthor("Lawrence James");
        bookModel1.setBookDetails("Edwin James Lawrence, most commonly known as Lawrence James, is an English historian and writer. James graduated with a BA in English & History from the University of York in 1966, and subsequently undertook a research degree at Merton College, Oxford. Following a career as a teacher, James became a full-time writer in 1985. James has written several works of popular history about the British Empire, and has contributed pieces for Daily Mail, The Times and the Literary Review.");
        bookModel1.setBookCategory("Biography");
        bookModel1.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2FNapoleon_%20A%20Biography%20(%20PDFDrive%20).pdf?alt=media&token=08620054-fa41-4df2-9708-d1eedc2bc53a");
        bookModel1.setBookThumbnail("https://cdn.asaha.com/assets/thumbs/cbc/cbccfdcf43fe538b39780f4f00ef21a9.jpg");

        biographyList.add(bookModel1);


        NewBookModel bookModel2 = new NewBookModel();
        bookModel2.setBookName("Gandhi: An Autobiography");
        bookModel2.setBookAuthor("M.K Ghandhi");
        bookModel2.setBookDetails("The Gandhis belong to the Bania caste and seem to have been originally grocers. But for three generations, from my grandfather, they have been Prime Ministers in several Kathiawad States. Uttamchand Gandhi, alias Ota Gandhi, my grandfather, must have been a man of principle. State intrigues compelled him to leave Porbandar, where he was Diwan, and to seek refuge in Junagadh. There he saluted the Nawab with the left hand. Someone, noticing the apparent discourtesy, asked for an explanation, which was given thus: The right hand is already pledged to Porbandar.");
        bookModel2.setBookCategory("Biography");
        bookModel2.setBookPDFLink("https://lakshminarayanlenasia.com/articles/Gandhi-Truth.pdf");
        bookModel2.setBookThumbnail("https://cdn.asaha.com/assets/thumbs/9c5/9c5a9e0d801e4f550dc26ab5cf5618de.jpg");

        biographyList.add(bookModel2);


        NewBookModel bookModel3 = new NewBookModel();
        bookModel3.setBookName("Mother Teresa - A Biography");
        bookModel3.setBookAuthor("Meg Greene");
        bookModel3.setBookDetails("Meg Greene is a historian and writer. She is the author of volumes on Henry Louis Gates, Jr., Billie Holiday, Jane Goodall, Mother Teresa, and Pope John Paul II in the Greenwood Biographies series, as well as of numerous other works, many of them about American history");
        bookModel3.setBookCategory("Biography");
        bookModel3.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2FMother%20Teresa%20-%20A%20Biography%20(%20PDFDrive%20).pdf?alt=media&token=6ced6ada-ae67-4a0b-81d8-29c18efa4ac1");
        bookModel3.setBookThumbnail("https://cdn.asaha.com/assets/thumbs/a2f/a2fa84b671971cedd93ee9932c69feed.jpg");

        biographyList.add(bookModel3);


        NewBookModel bookModel4 = new NewBookModel();
        bookModel4.setBookName("Che Guevara: A Biography");
        bookModel4.setBookAuthor("Richard L. Harris");
        bookModel4.setBookDetails("Richard Harris is Professor Emeritus of Global Studies at California State University Monterey Bay. He has a Ph. D. in Political Science and a Masters of Public Administration from the University of California, Los Angeles. He is currently an independent lecturer, researcher, consultant, writer and editor.");
        bookModel4.setBookCategory("Biography");
        bookModel4.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2FChe%20Guevara_%20A%20Biography%20(Greenwood%20Biographies)%20%20%20(%20PDFDrive%20).pdf?alt=media&token=ecddeb43-e2aa-4b44-9440-8720dc3e2b85");
        bookModel4.setBookThumbnail("https://cdn.asaha.com/assets/thumbs/295/295b0fab99ff55301745c0d71d829fe1.jpg");

        biographyList.add(bookModel4);


        NewBookModel bookModel5 = new NewBookModel();
        bookModel5.setBookName("When the Moon Split");
        bookModel5.setBookAuthor("Saif Ur Rehman");
        bookModel5.setBookDetails("Safiur Rahman Mubarakpuri was an Indian writer. Mubarakpuri was born in Husainabad, a village one mile deep to the north side of Mubarakpur, Azamgarh district, Uttar Pradesh, India.");
        bookModel5.setBookCategory("Biography");
        bookModel5.setBookPDFLink("https://fb2bookfree.com/uploads/files/2020-10/1602552726_when-the-moon-split.pdf");
        bookModel5.setBookThumbnail("https://cdn.asaha.com/assets/thumbs/26d/26d5391ee9de370250de3bc599d3fad9.jpg");

        biographyList.add(bookModel5);

        NewBookModel bookModel6 = new NewBookModel();
        bookModel6.setBookName("Presentation Secrets Of Steve Jobs");
        bookModel6.setBookAuthor("Carmine Gallo");
        bookModel6.setBookDetails("Carmine Gallo is an American author, columnist, keynote speaker, and former journalist and news anchor. Based in Pleasanton, California, he is President of Gallo Communications Group and works as a communication coach and speaker");
        bookModel6.setBookCategory("Biography");
        bookModel6.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2FPresentation%20Secrets%20Of%20Steve%20Jobs%20(%20PDFDrive%20).pdf?alt=media&token=74487b97-3d9f-48d7-8eb1-f2344be1ee81");
        bookModel6.setBookThumbnail("https://cdn.asaha.com/assets/thumbs/f87/f8750e23839ee606b60cf2d19b415068.jpg");

        biographyList.add(bookModel6);


        NewBookModel bookModel7 = new NewBookModel();
        bookModel7.setBookName("Subtle is the Lord: The Science and Life of Albert Einstein");
        bookModel7.setBookAuthor("Abraham Pais");
        bookModel7.setBookDetails("Abraham Pais was a Dutch-American physicist and science historian. Pais earned his Ph.D. from University of Utrecht just prior to a Nazi ban on Jewish participation in Dutch universities during World War II.");
        bookModel7.setBookCategory("Biography");
        bookModel7.setBookPDFLink("https://ebooksworm.com/abraham_pais_subtle_is_the_lord.pdf");
        bookModel7.setBookThumbnail("https://cdn.asaha.com/assets/thumbs/66a/66adfdd7e0fb090d4e290d2f9c260eb9.jpg");

        biographyList.add(bookModel7);


        NewBookModel bookModel8 = new NewBookModel();
        bookModel8.setBookName("Mein Kampf ");
        bookModel8.setBookAuthor("Adolf Hitler");
        bookModel8.setBookDetails("Adolf Hitler was an Austrian-born German politician who was dictator of Germany from 1933 until his death in 1945. He rose to power as the leader of the Nazi Party, becoming the chancellor in 1933 and then taking the title of Führer und Reichskanzler in 1934.");
        bookModel8.setBookCategory("Biography");
        bookModel8.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2F%D9%83%D9%81%D8%A7%D8%AD%D9%8A_Foulabook.com_.pdf?alt=media&token=f59d7b85-3b7d-4fdf-af14-a0fa6d00b607");
        bookModel8.setBookThumbnail("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/images%2Fmien_kamp.jpg?alt=media&token=146f002a-e48e-472b-8729-2ed7ea9c9ae7");

        biographyList.add(bookModel8);


        NewBookModel bookModel9 = new NewBookModel();
        bookModel9.setBookName("Lenin");
        bookModel9.setBookAuthor("Vladimir Lenin");
        bookModel9.setBookDetails("Vladimir Ilyich Ulyanov, better known as Vladimir Lenin, was a Russian revolutionary, politician, and political theorist. He served as the first and founding head of government of Soviet Russia from 1917 to 1924 and of the Soviet Union from 1922 to 1924.");
        bookModel9.setBookCategory("Biography");
        bookModel9.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2FNoor-Book.com%20%20%D9%84%D9%8A%D9%86%D9%8A%D9%86%20%D9%86%D8%B5%D9%88%D8%B5%20%D8%AD%D9%88%D9%84%20%D8%A7%D9%84%D9%85%D9%88%D9%82%D9%81%20%D9%85%D9%86%20%D8%A7%D9%84%D8%AF%D9%8A%D9%86%203%20.pdf?alt=media&token=753b965b-a004-4234-b5a8-803124f19470");
        bookModel9.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/13/b/1/f/d382690ab9b1f301693e397d9afa4e05.png.webp");

        biographyList.add(bookModel9);

    }

    private void addHistoryData() {


        NewBookModel bookModel1 = new NewBookModel();
        bookModel1.setBookName("History Of The Caliphs");
        bookModel1.setBookAuthor("Jalal AlDin AlSuyuti");
        bookModel1.setBookDetails("Jalal al-Din al-Suyuti, or Al-Suyuti, was an Egyptian Sunni ascetic polymath, Mujtahid and Mujaddid of the Islamic 10th century. A premier muhaddith, mufassir, faqīh, Arabic specialist, historian and philologist, who massively contributed to every Islamic science.");
        bookModel1.setBookCategory("History");
        bookModel1.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2FNoor-Book.com%20%20%D8%AA%D8%A7%D8%B1%D9%8A%D8%AE%20%D8%A7%D9%84%D8%AE%D9%84%D9%81%D8%A7%D8%A1%202%20.pdf?alt=media&token=25568d91-4f8d-4644-88a2-f1c621f8b0ed");
        bookModel1.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/3/e/5/7/032d74090ce57139be38ed27e408b2b3.jpg.webp");

        historyList.add(bookModel1);


        NewBookModel bookModel2 = new NewBookModel();
        bookModel2.setBookName("History Of Europe In The Middle Ages");
        bookModel2.setBookAuthor("Morris Bishop");
        bookModel2.setBookDetails("Morris Gilbert Bishop was an American scholar, historian, biographer, essayist, translator, anthologist, and poet");
        bookModel2.setBookCategory("History");
        bookModel2.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2Fhistory_of_europe.pdf?alt=media&token=1df29758-9662-4172-b50f-0f7ed0994415");
        bookModel2.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/6/2/d/7/ddef9dfbac2d7dfb93eb435afaf8cc62.png.webp");

        historyList.add(bookModel2);


        NewBookModel bookModel3 = new NewBookModel();
        bookModel3.setBookName("A Brief History Of Time From The Big Bang To Black Holes");
        bookModel3.setBookAuthor("Stephen Hawking");
        bookModel3.setBookDetails("Stephen William Hawking CH CBE FRS FRSA was an English theoretical physicist, cosmologist, and author who, at the time of his death, was director of research at the Centre for Theoretical Cosmology at the University of Cambridge.");
        bookModel3.setBookCategory("History");
        bookModel3.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2FNoor-Book.com%20%20%D8%AA%D8%A7%D8%B1%D9%8A%D8%AE%20%D9%85%D9%88%D8%AC%D8%B2%20%D9%84%D9%84%D8%B2%D9%85%D8%A7%D9%86%20%D9%85%D9%86%20%D8%A7%D9%84%D8%A5%D9%86%D9%81%D8%AC%D8%A7%D8%B1%20%D8%A7%D9%84%D9%83%D8%A8%D9%8A%D8%B1%20%D8%AD%D8%AA%D9%89%20%D8%A7%D9%84%D8%AB%D9%82%D9%88%D8%A8%20%D8%A7%D9%84%D8%B3%D9%88%D8%AF%D8%A7%D8%A1.pdf?alt=media&token=f9691736-e243-41bc-9801-b8a9c49310a9");
        bookModel3.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/6/8/1/2/4dd080ccd58129be49898fcf64d4c0b8.png.webp");

        historyList.add(bookModel3);


        NewBookModel bookModel4 = new NewBookModel();
        bookModel4.setBookName("History Of World Civilizations");
        bookModel4.setBookAuthor("Charles Snoubus");
        bookModel4.setBookDetails("History Of Ancient Civilization is presented here in a high quality paperback edition. This popular classic work by Charles Seignobos is in the English language, and may not include graphics or images from the original edition. If you enjoy the works of Charles Seignobos then we highly recommend this publication for your book collection.");
        bookModel4.setBookCategory("History");
        bookModel4.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2Fhisotry_of_civilization.pdf?alt=media&token=36bc19c6-b06b-4fb7-8b41-03ed53e459c1");
        bookModel4.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/6/1/b/6/f625f4cf111b673e25556339631c42d4.png.webp");

        historyList.add(bookModel4);


        NewBookModel bookModel5 = new NewBookModel();
        bookModel5.setBookName("History Of Sociology");
        bookModel5.setBookAuthor("Jastoon");
        bookModel5.setBookDetails("Sociology is the scientific study of society, including patterns of social relationships, social interaction, and culture. The term sociology was first used by Frenchman Auguste Compte in the 1830s when he proposed a synthetic science uniting all knowledge about human activity.");
        bookModel5.setBookCategory("History");
        bookModel5.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2Fhistory_of_socialology.pdf?alt=media&token=619e17b2-ac7d-4e28-b96f-53f22e316635");
        bookModel5.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/6/d/a/a/80acf2a455daa6f27d5dfd0b20158ee3.png.webp");

        historyList.add(bookModel5);


        NewBookModel bookModel6 = new NewBookModel();
        bookModel6.setBookName("A More Brief History Of Time");
        bookModel6.setBookAuthor("Stephen Hawking");
        bookModel6.setBookDetails("Stephen William Hawking CH CBE FRS FRSA was an English theoretical physicist, cosmologist, and author who, at the time of his death, was director of research at the Centre for Theoretical Cosmology at the University of Cambridge.");
        bookModel6.setBookCategory("History");
        bookModel6.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2FNoor-Book.com%20%20%D8%AA%D8%A7%D8%B1%D9%8A%D8%AE%20%D9%85%D9%88%D8%AC%D8%B2%20%D9%84%D9%84%D8%B2%D9%85%D8%A7%D9%86%20%D9%85%D9%86%20%D8%A7%D9%84%D8%A5%D9%86%D9%81%D8%AC%D8%A7%D8%B1%20%D8%A7%D9%84%D9%83%D8%A8%D9%8A%D8%B1%20%D8%AD%D8%AA%D9%89%20%D8%A7%D9%84%D8%AB%D9%82%D9%88%D8%A8%20%D8%A7%D9%84%D8%B3%D9%88%D8%AF%D8%A7%D8%A1.pdf?alt=media&token=f9691736-e243-41bc-9801-b8a9c49310a9");
        bookModel6.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/6/7/5/1/3212bf30cd751b53b0e6e0c796e49cd8.png.webp");

        historyList.add(bookModel6);


        NewBookModel bookModel7 = new NewBookModel();
        bookModel7.setBookName("The History Of Morocco");
        bookModel7.setBookAuthor("Yusuf Bosti");
        bookModel7.setBookDetails("Stephen William Hawking CH CBE FRS FRSA was an English theoretical physicist, cosmologist, and author who, at the time of his death, was director of research at the Centre for Theoretical Cosmology at the University of Cambridge.");
        bookModel7.setBookCategory("History");
        bookModel7.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2Fhistory_of_morroco.pdf?alt=media&token=905d38af-fc0d-44ba-92be-fdc84aa885a0");
        bookModel7.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/2/d/8/8/a88fee1f5dd887bf9a3ccb820c305fa2.png.webp");

        historyList.add(bookModel7);


        NewBookModel bookModel8 = new NewBookModel();
        bookModel8.setBookName("Modern European History");
        bookModel8.setBookAuthor("Jeffrey Brown");
        bookModel8.setBookDetails("Jeffrey Brown is the author-illustrator of the New York Times bestselling Star Wars: Jedi Academy series and the Darth Vader series. He is also the author.");
        bookModel8.setBookCategory("History");
        bookModel8.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2Fnew_history.pdf?alt=media&token=02007ec3-c03f-4f38-a528-fcfa01b77b2e");
        bookModel8.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/9/b/f/5/22a00ee441bf53dbb95a794be88fac55.png.webp");

        historyList.add(bookModel8);


        NewBookModel bookModel9 = new NewBookModel();
        bookModel9.setBookName("History Of The Prophets");
        bookModel9.setBookAuthor("Ahmed Ali");
        bookModel9.setBookDetails("");
        bookModel9.setBookCategory("History");
        bookModel9.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2Fprophets.pdf?alt=media&token=fbf83453-f9fd-4fa2-829a-20e25eb0f56b");
        bookModel9.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/1/f/1/d/482f4eea49f1dad089c5212fd25841e6.png.webp");

        historyList.add(bookModel9);


    }

    private void addLiteratureData() {

        NewBookModel bookModel1 = new NewBookModel();
        bookModel1.setBookName("Arabic Literature In The Abbasid Era");
        bookModel1.setBookAuthor("Dr. Nazim Rashid");
        bookModel1.setBookDetails("");
        bookModel1.setBookCategory("Arabic Literature");
        bookModel1.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2FNoor-Book.com%20%20%D8%A7%D9%84%D8%A3%D8%AF%D8%A8%20%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A%20%D9%81%D9%8A%20%D8%A7%D9%84%D8%B9%D8%B5%D8%B1%20%D8%A7%D9%84%D8%B9%D8%A8%D8%A7%D8%B3%D9%8A.pdf?alt=media&token=f8f347e8-990f-4c81-b9b4-3974845940bf");
        bookModel1.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/2/2/7/6/0541c5a083276c50644919a8b4f94e5d.PNG.webp");

        arabicLiteratureList.add(bookModel1);


        NewBookModel bookModel2 = new NewBookModel();
        bookModel2.setBookName("Arabic literature");
        bookModel2.setBookAuthor("Edwar Morcos");
        bookModel2.setBookDetails("");
        bookModel2.setBookCategory("Arabic Literature");
        bookModel2.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2Farabic_let_1.pdf?alt=media&token=fa70a4a8-6932-4a04-8538-3472b4d1fecf");
        bookModel2.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/13/a/b/a/e9c141e8f1aba67930252f91552b2f59.png.webp");

        arabicLiteratureList.add(bookModel2);


        NewBookModel bookModel3 = new NewBookModel();
        bookModel3.setBookName("Arabic Literature And Its History In The Umayyad And Abbasid Eras");
        bookModel3.setBookAuthor("Jill Biro");
        bookModel3.setBookDetails("");
        bookModel3.setBookCategory("Arabic Literature");
        bookModel3.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2Fjill_brio.pdf?alt=media&token=0343c867-9f6c-460b-a4e3-eb69b9deff72");
        bookModel3.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/8/2/0/a/0f7e53deed20a0bc2d55863d4e7d3f82.png.webp");

        arabicLiteratureList.add(bookModel3);


        NewBookModel bookModel4 = new NewBookModel();
        bookModel4.setBookName("Arabic Literature Through The Ages");
        bookModel4.setBookAuthor("Dr. Muhammad Kalou");
        bookModel4.setBookDetails("");
        bookModel4.setBookCategory("Arabic Literature");
        bookModel4.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2Farabic_let_2.pdf?alt=media&token=ec876431-83d2-4900-98ff-4caca018303d");
        bookModel4.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/13/8/4/1/cb3a7c907e841183faeb2ef3276110f3.png.webp");

        arabicLiteratureList.add(bookModel4);


        NewBookModel bookModel5 = new NewBookModel();
        bookModel5.setBookName("Islamic Religion Primary");
        bookModel5.setBookAuthor("Author");
        bookModel5.setBookDetails("");
        bookModel5.setBookCategory("Arabic Literature");
        bookModel5.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2Fprimary_1.pdf?alt=media&token=e4e594e4-e013-4dae-9315-a8375715b985");
        bookModel5.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/13/4/5/6/6ebf7dce18456386684459bf28462347.png.webp");

        arabicLiteratureList.add(bookModel5);


        NewBookModel bookModel6 = new NewBookModel();
        bookModel6.setBookName("Islamic Religion");
        bookModel6.setBookAuthor("Author");
        bookModel6.setBookDetails("");
        bookModel6.setBookCategory("Arabic Literature");
        bookModel6.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2Fbook2.pdf?alt=media&token=246025f3-9e1e-4627-9b8d-c4d61c302d33");
        bookModel6.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/13/9/d/b/acc964836d9dba149bbdf2a522c7169e.png.webp");

        arabicLiteratureList.add(bookModel6);


        NewBookModel bookModel7 = new NewBookModel();
        bookModel7.setBookName("Islamic Renewal In The Methodology Of Interpretation");
        bookModel7.setBookAuthor("Muhammad Rifaat Zanjir");
        bookModel7.setBookDetails("");
        bookModel7.setBookCategory("Arabic Literature");
        bookModel7.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2Fislamic_renew.pdf?alt=media&token=6e502e0b-bdb9-45eb-8161-bd8b587ee2af");
        bookModel7.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/13/f/7/4/c9a7e4dfc7f74b6c710d00e0db75201f.png.webp");

        arabicLiteratureList.add(bookModel7);


        NewBookModel bookModel8 = new NewBookModel();
        bookModel8.setBookName("Arabic Grammar Summary");
        bookModel8.setBookAuthor("Fouad Nehme");
        bookModel8.setBookDetails("");
        bookModel8.setBookCategory("Arabic Literature");
        bookModel8.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2Fbook_3.pdf?alt=media&token=4fadf7ac-96d1-43b4-83b5-107fbe97a4bb");
        bookModel8.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/3/9/5/c/fee5899a7f95c538ab7b02e9f0484cd8.jpg.webp");

        arabicLiteratureList.add(bookModel8);

    }

    private void addScienceData() {

        NewBookModel bookModel1 = new NewBookModel();
        bookModel1.setBookName("Engineering Drawing Book");
        bookModel1.setBookAuthor("Rafe Walid AlBaghdadi");
        bookModel1.setBookDetails("");
        bookModel1.setBookCategory("Science");
        bookModel1.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2Fengg_drawing_book.pdf?alt=media&token=b77d5144-cacd-462e-b904-140d48411ba2");
        bookModel1.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/4/c/5/a/03d4863b2bc5aa4be8af78f813f151df.png.webp");

        scienceList.add(bookModel1);


        NewBookModel bookModel2 = new NewBookModel();
        bookModel2.setBookName("Descriptive Geometry");
        bookModel2.setBookAuthor("Ibrahim");
        bookModel2.setBookDetails("");
        bookModel2.setBookCategory("Science");
        bookModel2.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2Fdec_gematory.pdf?alt=media&token=2807ac36-2216-4409-9d2f-e7196b09fb32");
        bookModel2.setBookThumbnail("https://www.noor-book.com/publice/covers_cache_webp/2/f/3/0/6d8491b3b6f3005fdfa87b2722ce3d5d.jpg.webp");

        scienceList.add(bookModel2);


        NewBookModel bookModel3 = new NewBookModel();
        bookModel3.setBookName("The Nature Fix: Why Nature Makes us Happier, Healthier and More Creative");
        bookModel3.setBookAuthor("Florence Williams");
        bookModel3.setBookDetails("A contributing editor at Outside magazine, Florence Williams is the author of Breasts, winner of the Los Angeles Times Book Prize, and The Nature Fix. Her writing has appeared in the New York Times, National Geographic, and many other outlets. She lives in Washington, DC");
        bookModel3.setBookCategory("Science");
        bookModel3.setBookPDFLink("https://firebasestorage.googleapis.com/v0/b/oripikapplication.appspot.com/o/books%2FThe%20Nature%20Fix_%20Why%20Nature%20Makes%20us%20Happier%2C%20Healthier%20and%20More%20Creative%20(%20PDFDrive%20).pdf?alt=media&token=dc9b2fd9-30eb-45c6-b300-fcecec663793");
        bookModel3.setBookThumbnail("https://cdn.asaha.com/assets/thumbs/d2c/d2ca15095d43f455bb41f4deb511d036.jpg");

        scienceList.add(bookModel3);


        NewBookModel bookModel4 = new NewBookModel();
        bookModel4.setBookName("Python Programming For Beginners");
        bookModel4.setBookAuthor("Adam Stewart");
        bookModel4.setBookDetails("");
        bookModel4.setBookCategory("Science");
        bookModel4.setBookPDFLink("https://fb2bookfree.com/uploads/files/2020-06/1592276631_python-programming-for-beginners.pdf");
        bookModel4.setBookThumbnail("https://fb2bookfree.com/uploads/posts/2020-06/1592276426_41pezxpszl._sx331_bo1204203200_.jpg");

        scienceList.add(bookModel4);


        NewBookModel bookModel5 = new NewBookModel();
        bookModel5.setBookName("Comprehensive Medicinal Chemistry");
        bookModel5.setBookAuthor("Peter Kennewell");
        bookModel5.setBookDetails("This volume provides and educative and authoriative discussions on the drug discovery and development process. It is divided into ten sections and starts with personal recollections on the history and evolution of the drug discovery process. To illustrate the end result of the drug discovery process, a large chapter reviews the major drug introductions over 1993-2003. Subsequent chapters examine the impact of genomic technologies, new sources of drugs and alternatives to animal testing. ");
        bookModel5.setBookCategory("Science");
        bookModel5.setBookPDFLink("https://fb2bookfree.com/uploads/files/2020-06/1591151959_comprehensive-medicinal-chemistry-ii-volume-1.pdf");
        bookModel5.setBookThumbnail("https://fb2bookfree.com/uploads/posts/2020-06/1591151463_41i-dmaappl._sx356_bo1204203200_.jpg");

        scienceList.add(bookModel5);


        NewBookModel bookModel6 = new NewBookModel();
        bookModel6.setBookName("The Universe in a Nutshell");
        bookModel6.setBookAuthor("Stephan Hawking");
        bookModel6.setBookDetails("This volume provides and educative and authoriative discussions on the drug discovery and development process. It is divided into ten sections and starts with personal recollections on the history and evolution of the drug discovery process. To illustrate the end result of the drug discovery process, a large chapter reviews the major drug introductions over 1993-2003. Subsequent chapters examine the impact of genomic technologies, new sources of drugs and alternatives to animal testing. ");
        bookModel6.setBookCategory("Science");
        bookModel6.setBookPDFLink("https://fb2bookfree.com/uploads/files/2020-06/1592276300_the-universe-in-a-nutshell.pdf");
        bookModel6.setBookThumbnail("https://fb2bookfree.com/uploads/posts/2020-06/1592275938_66251.jpg");

        scienceList.add(bookModel6);


        NewBookModel bookModel8 = new NewBookModel();
        bookModel8.setBookName("The Problems Of Philosophy");
        bookModel8.setBookAuthor("Bertrand Russell");
        bookModel8.setBookDetails("The book `The Problems of Philosophy` was written by B. Russell as a popular introduction to philosophy in 1910 and is still one of the best works of this kind .The volume of the book is small, but, despite this, Russell was able to consider here the most basic issues of philosophy. The Problems of Philosophy can be used to teach philosophy at almost all levels of education - from secondary school to university and postgraduate study, as well as a textbook for special courses at philosophical faculties.");
        bookModel8.setBookCategory("Science");
        bookModel8.setBookPDFLink("https://fb2bookfree.com/uploads/files/2020-05/1589024451_the-problems-of-philosophy-by-bertrand-russell.pdf");
        bookModel8.setBookThumbnail("https://fb2bookfree.com/uploads/posts/2020-05/1589024377_41mnyjo9kwl._sy445_ql70_ml2_.jpg");

        scienceList.add(bookModel8);


        NewBookModel bookModel9 = new NewBookModel();
        bookModel9.setBookName("The Jupiter Weapon");
        bookModel9.setBookAuthor("Charles L. Fontenay");
        bookModel9.setBookDetails("He was a living weapon of destruction--immeasurably powerful, utterly invulnerable. There was only one question: Was he human?");
        bookModel9.setBookCategory("Science");
        bookModel9.setBookPDFLink("https://fb2bookfree.com/uploads/files/2020-05/1588595577_the-jupiter-weapon-by-charles-l.-fontenay.pdf");
        bookModel9.setBookThumbnail("https://fb2bookfree.com/uploads/posts/2020-05/1588594793_the-jupiter-weapon-by-charles-l.-fontenay.jpg");

        scienceList.add(bookModel9);


        NewBookModel bookModel10 = new NewBookModel();
        bookModel10.setBookName("Lost in the Future");
        bookModel10.setBookAuthor("John Victor Peterson");
        bookModel10.setBookDetails("Did you ever wonder what might happen if mankind ever exceeded the speed of light? Here is a profound story based on that thought, a story which may well forecast one of the problems to be encountered in space travel.");
        bookModel10.setBookCategory("Science");
        bookModel10.setBookPDFLink("https://fb2bookfree.com/uploads/files/2020-05/1588589960_lost-in-the-future-by-john-victor-peterson.pdf");
        bookModel10.setBookThumbnail("https://fb2bookfree.com/uploads/posts/2020-05/1588589785_lost-in-the-future-by-john-victor-peterson.jpg");

        scienceList.add(bookModel10);

    }

    private void addFictionData() {

        NewBookModel bookModel1 = new NewBookModel();
        bookModel1.setBookName("The Giver");
        bookModel1.setBookAuthor("Lois Lowry");
        bookModel1.setBookDetails("The Giver is a 1993 American young adult dystopian novel written by Lois Lowry, set in a society which at first appears to be utopian but is revealed to be dystopian as the story progresses. In the novel, the society has taken away pain and strife by converting to \"Sameness\", a plan that has also eradicated emotional depth from their lives. In an effort to preserve order, the society also lacks any color, climate, terrain, and a true sense of equality. ");
        bookModel1.setBookCategory("Fiction");
        bookModel1.setBookPDFLink("https://fb2bookfree.com/uploads/files/2022-12/1670805178_the-giver.pdf");
        bookModel1.setBookThumbnail("https://fb2bookfree.com/uploads/posts/2022-12/1670804574_3636.jpg");

        fictionList.add(bookModel1);


        NewBookModel bookModel2 = new NewBookModel();
        bookModel2.setBookName("The Lady or The Tiger");
        bookModel2.setBookAuthor("Frank Richard Stockton");
        bookModel2.setBookDetails("A semi-barbaric king rules a land sometime in the past. Some of the king's ideas are progressive, but others cause people to suffer. One of the king's innovations is the use of a public trial by ordeal as \"an agent of poetic justice\", with guilt or innocence decided by the result of chance. A person accused of a crime is brought into a public arena and must choose one of two doors. Behind one door is a lady whom the king has deemed an appropriate match for the accused; behind the other is a fierce, hungry tiger. ");
        bookModel2.setBookCategory("Fiction");
        bookModel2.setBookPDFLink("https://fb2bookfree.com/uploads/files/2022-12/1670297391_the-lady-or-the-tiger.pdf");
        bookModel2.setBookThumbnail("https://fb2bookfree.com/uploads/posts/2022-12/1670297136_9781466804111.jpg");

        fictionList.add(bookModel2);


        NewBookModel bookModel3 = new NewBookModel();
        bookModel3.setBookName("Mosses from an Old Manse");
        bookModel3.setBookAuthor("Nathaniel Hawthorne");
        bookModel3.setBookDetails("Mosses from an Old Manse is Nathaniel Hawthorne’s second story collection, first published in 1846 in two volumes and featuring sketches and tales written over  a span of more than twenty years, including such classics as Young Goodman Brown, The Birthmark, and Rappaccini’s Daughter.Herman Melville deemed Hawthorne the American Shakespeare, and Henry James wrote that his early tales possess the element of simple genius, the quality of imagination. ");
        bookModel3.setBookCategory("Fiction");
        bookModel3.setBookPDFLink("https://fb2bookfree.com/uploads/files/2022-11/1669262439_mosses-from-an-old-manse.pdf");
        bookModel3.setBookThumbnail("https://fb2bookfree.com/uploads/posts/2022-11/1669262340_30822573._sy475_.jpg");

        fictionList.add(bookModel3);


        NewBookModel bookModel4 = new NewBookModel();
        bookModel4.setBookName("House on Mango Street");
        bookModel4.setBookAuthor("Sandra Cisneros");
        bookModel4.setBookDetails("The House on Mango Street is a 1984 novel by Mexican-American author Sandra Cisneros. Structured as a series of vignettes, it tells the story of Esperanza Cordero, a 12-year-old Chicana girl growing up in the Hispanic quarter of Chicago. Based in part on Cisneros's own experience, the novel follows Esperanza over the span of one year in her life, as she enters adolescence and begins to face the realities of life as a young woman in a poor and patriarchal community.");
        bookModel4.setBookCategory("Fiction");
        bookModel4.setBookPDFLink("https://fb2bookfree.com/uploads/files/2022-11/1668401113_the-house-on-mango-street-pdf.pdf");
        bookModel4.setBookThumbnail("https://fb2bookfree.com/uploads/posts/2022-11/1668400683_91xbyrldxzl.jpg");

        fictionList.add(bookModel4);


        NewBookModel bookModel5 = new NewBookModel();
        bookModel5.setBookName("Act Like a Lady Think Like a Man");
        bookModel5.setBookAuthor("Steve Harvey");
        bookModel5.setBookDetails("Act Like A Lady Think Like A Man pdf free download. We made a living for more than twenty years making people laugh about themselves, about each other, about family, and friends, and, most certainly, about love, sex, and relationships. My humor is always rooted in truth and full of wisdom— the kind that comes from living, watching, learning, and knowing. I’m told my jokes strike chords with people because they can relate to them, especially the ones that explore the dynamics of relationships between men and women.");
        bookModel5.setBookCategory("Fiction");
        bookModel5.setBookPDFLink("https://fb2bookfree.com/uploads/files/2022-11/1668400334_act-like-a-lady-think-like-a-man-pdf-free-download.pdf");
        bookModel5.setBookThumbnail("https://fb2bookfree.com/uploads/posts/2022-11/1668400240_71wt5fbfo0l.jpg");

        fictionList.add(bookModel5);


        NewBookModel bookModel6 = new NewBookModel();
        bookModel6.setBookName("I Am Not Your Perfect Mexican Daughter");
        bookModel6.setBookAuthor("Erika Sánchez");
        bookModel6.setBookDetails("Perfect Mexican daughters do not go away to college. And they do not move out of their parents’ house after high school graduation. Perfect Mexican daughters never abandon their family. But Julia is not your perfect Mexican daughter. That was Olga’s role.");
        bookModel6.setBookCategory("Fiction");
        bookModel6.setBookPDFLink("https://fb2bookfree.com/uploads/files/2022-11/1667967893_i-am-not-your-perfect-mexican-daughter.pdf");
        bookModel6.setBookThumbnail("https://fb2bookfree.com/uploads/posts/2022-11/1667967589_51m1mxxfmil._sx329_bo1204203200_.jpg");

        fictionList.add(bookModel6);


        NewBookModel bookModel7 = new NewBookModel();
        bookModel7.setBookName("Brave New World");
        bookModel7.setBookAuthor("Aldous Huxley");
        bookModel7.setBookDetails("Marking the 75th anniversary of its original publication, Vintage Canada is proud to publish the first Canadian edition ever of the 1932 classic Brave New World with an original introduction by Margaret Atwood.");
        bookModel7.setBookCategory("Fiction");
        bookModel7.setBookPDFLink("https://fb2bookfree.com/uploads/files/2020-11/1606443679_brave-new-world.pdf");
        bookModel7.setBookThumbnail("https://fb2bookfree.com/uploads/posts/2020-11/1606443538_513xb6mc3cl._sx322_bo1204203200_.jpg");

        fictionList.add(bookModel7);


        NewBookModel bookModel8 = new NewBookModel();
        bookModel8.setBookName("Gone with the Wind");
        bookModel8.setBookAuthor("Margaret Mitchell");
        bookModel8.setBookDetails("This is the tale of Scarlett O’Hara, the spoiled, manipulative daughter of a wealthy plantation owner, who arrives at young womanhood just in time to see the Civil War forever change her way of life. A sweeping story of tangled passion and courage, in the pages of Gone With the Wind, Margaret Mitchell brings to life the unforgettable characters that have captured readers for over seventy years.");
        bookModel8.setBookCategory("Fiction");
        bookModel8.setBookPDFLink("https://fb2bookfree.com/uploads/files/2020-11/1606069467_gone-with-the-wind.pdf");
        bookModel8.setBookThumbnail("https://fb2bookfree.com/uploads/posts/2020-11/1606069314_51vxh2jgv8l._sx322_bo1204203200_.jpg");

        fictionList.add(bookModel8);


    }

    @Override
    protected void onStart() {
        myDb = new DataBaseHelper(MainActivity.this);



        if (bookModelArrayList.size() > 0)
            bookModelArrayList.clear();

        bookModelArrayList = myDb.getAllBooksData();

        motivationList = new ArrayList<>();
        if (motivationList.size() > 0)
            motivationList.clear();

        biographyList = new ArrayList<>();
        if (biographyList.size() > 0)
            biographyList.clear();


        historyList = new ArrayList<>();
        if (historyList.size() > 0)
            historyList.clear();


        arabicLiteratureList = new ArrayList<>();
        if (arabicLiteratureList.size() > 0)
            arabicLiteratureList.clear();


        scienceList = new ArrayList<>();
        if (scienceList.size() > 0)
            scienceList.clear();

        fictionList = new ArrayList<>();
        if (fictionList.size() > 0)
            fictionList.clear();


        addMotivationData();
        addBiographyData();
        addHistoryData();
        addLiteratureData();
        addScienceData();
        addFictionData();


        ///////////////////////////////////
        ///////Motivation RecyclerView/////
        ///////////////////////////////////
        motivation_books_rv = findViewById(R.id.motivation_books_rv);
        motivation_books_rv.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        motivation_books_rv.setLayoutManager(mLayoutManager);
        RecyclerView.ItemDecoration itemDecoration =
                new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL);
        motivation_books_rv.addItemDecoration(itemDecoration);

        MyRecyclerViewAdapter mAdapter = new MyRecyclerViewAdapter(MainActivity.this,MainActivity.this, motivationList);
        motivation_books_rv.setAdapter(mAdapter);

        ///////////////////////////////////
        ///////Biography RecyclerView//////
        ///////////////////////////////////
        biography_books_rv = findViewById(R.id.biography_books_rv);
        biography_books_rv.setHasFixedSize(true);
        LinearLayoutManager mLayoutTwoManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        biography_books_rv.setLayoutManager(mLayoutTwoManager);
        RecyclerView.ItemDecoration itemTwoDecoration =
                new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL);
        biography_books_rv.addItemDecoration(itemTwoDecoration);

        MyRecyclerViewAdapter biographyAdapter = new MyRecyclerViewAdapter(MainActivity.this,MainActivity.this, biographyList);
        biography_books_rv.setAdapter(biographyAdapter);


        ///////////////////////////////////
        ///////History RecyclerView////////
        ///////////////////////////////////
        history_books_rv = findViewById(R.id.history_books_rv);
        history_books_rv.setHasFixedSize(true);
        LinearLayoutManager mLayoutThreeManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        history_books_rv.setLayoutManager(mLayoutThreeManager);
        RecyclerView.ItemDecoration itemThreeDecoration =
                new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL);
        history_books_rv.addItemDecoration(itemThreeDecoration);

        MyRecyclerViewAdapter historyAdapter = new MyRecyclerViewAdapter(MainActivity.this,MainActivity.this, historyList);
        history_books_rv.setAdapter(historyAdapter);


        //////////////////////////////////////
        ///////Literature RecyclerView////////
        //////////////////////////////////////
        literature_books_rv = findViewById(R.id.literature_books_rv);
        literature_books_rv.setHasFixedSize(true);
        LinearLayoutManager mLayoutLiteratureManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        literature_books_rv.setLayoutManager(mLayoutLiteratureManager);
        RecyclerView.ItemDecoration itemLiteratureDecoration =
                new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL);
        literature_books_rv.addItemDecoration(itemLiteratureDecoration);

        MyRecyclerViewAdapter literatureAdapter = new MyRecyclerViewAdapter(MainActivity.this,MainActivity.this, arabicLiteratureList);
        literature_books_rv.setAdapter(literatureAdapter);


        ///////////////////////////////////
        ///////Science RecyclerView////////
        ///////////////////////////////////
        science_books_rv = findViewById(R.id.science_books_rv);
        science_books_rv.setHasFixedSize(true);
        LinearLayoutManager mLayoutScienceManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        science_books_rv.setLayoutManager(mLayoutScienceManager);
        RecyclerView.ItemDecoration itemScienceDecoration =
                new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL);
        science_books_rv.addItemDecoration(itemScienceDecoration);

        MyRecyclerViewAdapter scienceAdapter = new MyRecyclerViewAdapter(MainActivity.this,MainActivity.this, scienceList);
        science_books_rv.setAdapter(scienceAdapter);

        ///////////////////////////////////
        ///////Science RecyclerView////////
        ///////////////////////////////////
        fiction_books_rv = findViewById(R.id.fiction_books_rv);
        fiction_books_rv.setHasFixedSize(true);
        LinearLayoutManager mLayoutFictionManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        fiction_books_rv.setLayoutManager(mLayoutFictionManager);
        RecyclerView.ItemDecoration itemFictionDecoration =
                new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL);
        fiction_books_rv.addItemDecoration(itemFictionDecoration);

        MyRecyclerViewAdapter fictionAdapter = new MyRecyclerViewAdapter(MainActivity.this,MainActivity.this, fictionList);
        fiction_books_rv.setAdapter(fictionAdapter);


        ///////////////////////////////////
        ///////My Books RecyclerView///////
        ///////////////////////////////////
        all_books_rv = findViewById(R.id.all_books_rv);
        all_books_rv.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL, false);
        linearLayoutManager.setReverseLayout(false);
        linearLayoutManager.setStackFromEnd(false);
        all_books_rv.setLayoutManager(linearLayoutManager);
        RecyclerView.ItemDecoration itemMyBooksDecoration =
                new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL);
        fiction_books_rv.addItemDecoration(itemMyBooksDecoration);

        MyRecyclerViewAdapter bookAdapter = new MyRecyclerViewAdapter(MainActivity.this,
                MainActivity.this, bookModelArrayList);
        all_books_rv.setAdapter(bookAdapter);

        super.onStart();
    }

    public void onItemClicked(NewBookModel newBookModel){
        Intent intent = new Intent(MainActivity.this, BookDetailsActivity.class);
        intent.putExtra("bookObj", newBookModel);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
}