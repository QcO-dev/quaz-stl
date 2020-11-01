package quaz.util;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class IniFile {
	
	
	private final Map<String, Properties> categories;
	private Map<String, Properties> defaults;
	
	public IniFile(Map<String, Properties> categories) {
		this.categories = categories;
	}
	
	public Map<String, Properties> getDefaults() {
		return defaults;
	}

	public void setDefaults(Map<String, Properties> defaults) {
		this.defaults = defaults;
	}

	public Map<String, Properties> getCategories() {
		return categories;
	}
	
	public Object get(String category, String key) {
		
		Properties prop = categories.get(category);
		if(prop == null) {
			if(defaults == null) {
				return null;
			}
			
			prop = defaults.get(category);
		}
		
		Object value = prop.get(key);
		if(value == null) {
			return defaults.get(category).get(key);
		}
		else {
			return value;
		}
		
	}
	
	
	

	// By hoat4 on Stack Overflow - https://stackoverflow.com/questions/190629/what-is-the-easiest-way-to-parse-an-ini-file-in-java
	// Slight Modifications made
	/**
	 * 
	 * Parses and INI file. May give unexpected results on malformed input.
	 * 
	 * @param reader The reader which provides file io.
	 * @return An IniFile, which contains the categories and values of this file
	 * @throws IOException Failure to read the file
	 */
	public static IniFile parseINI(Reader reader) throws IOException {
	    Map<String, Properties> result = new HashMap<>();
	    new Properties() {
			private static final long serialVersionUID = -6924454456303555124L;
			private Properties section;

	        @Override
	        public Object put(Object key, Object value) {
	            String header = (((String) key) + " " + value).trim();
	            if (header.startsWith("[") && header.endsWith("]"))
	                return result.put(header.substring(1, header.length() - 1), 
	                        section = new Properties());
	            else
	                return section.put(key, value);
	        }

	    }.load(reader);
	    return new IniFile(result);
	}
	
}
