package org.rac.utils;

import org.archiviststoolkit.exceptions.DuplicateLinkException;
import org.archiviststoolkit.exceptions.UnknownLookupListException;
import org.archiviststoolkit.model.ArchDescription;
import org.archiviststoolkit.model.ArchDescriptionNames;
import org.archiviststoolkit.model.Names;
import org.archiviststoolkit.mydomain.NamesDAO;
import org.archiviststoolkit.mydomain.PersistenceException;
import org.archiviststoolkit.util.StringHelper;
import org.rac.model.Patrons;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class PatronUtils {

    // Method to generate and set the md5 hash for a Names object. It should
    // also be call every time the update is called
    public static String setMd5Hash(Patrons patrons) throws NoSuchAlgorithmException,
            UnsupportedEncodingException {
        StringBuffer textBuffer = new StringBuffer();
        String md5hash = null;

        // must append numbers so that empty spaces are accounted for and should lead to creation of unique hash
        textBuffer.append(patrons.getSortName()).append(1);
        textBuffer.append(patrons.getPrimaryName()).append(7);
        textBuffer.append(patrons.getRestOfName()).append(8);
        textBuffer.append(patrons.getPrefix()).append(9);
        textBuffer.append(patrons.getSuffix()).append(10);
        textBuffer.append(patrons.getTitle()).append(13);

        String text = textBuffer.toString();
        md5hash = StringHelper.MD5(text);
        patrons.setMd5Hash(md5hash);

        return md5hash;
    }

}