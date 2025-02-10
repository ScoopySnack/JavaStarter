package gr.aueb.cf.ch9.challenges;

/**
 * 1. Κάντε αντιγραφή ενός binary αρχείου το όνομα του οποίου θα εισάγει ο χρήστης
 * και θα βρίσκεται σε ένα προκαθορισμένο φάκελο, έστω C:/tmp/
 * 2. Η αντιγραφή θα γίνεται σε ένα νέο αρχείο με διαφορετικό όνομα. Π.χ. Αν το αρχικό όνομα του αρχείου είναι το
 * userInputFile, τότε νέο όνομα μπορεί να είναι outPath + UUID.randomUUID().toString().replace(":", "_") + userInputFile;
 * όπου το UUID.randomUUID() παράγει ένα νέο τυχαίο Universal Unique ID το οποίο μετατρέπουμε σε String με την toString()
 * και στη συνέχεια αντικαθιστούμε το : με _ μιας και τα ονόματα αρχείων δεν μπορούν να περιέχουν :.
 * 3. Εμφανίστε τα ακόλουθα metadata μετά την αντιγραφή:
 * • Το πλήρες όνομα (absolute path) του αρχικού αρχείου π.χ. C:\tmp\dummy.pdf
 * • Το πλήρες όνομα του αποθηκευμένου αρχείου, π.χ. C:\tmp\59b06b13-7b53-4bf4-9b2452bdffc825fadummy.pdf
 * • Την επέκταση (extension) χωρίς την τελεία, π.χ. pdf
 */
public class MetadataOut {

    public static void main(String[] args) {

    }


}
