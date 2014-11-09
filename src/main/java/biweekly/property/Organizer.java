package biweekly.property;

import biweekly.component.VEvent;
import biweekly.component.VFreeBusy;
import biweekly.component.VJournal;
import biweekly.component.VTodo;

/*
 Copyright (c) 2013-2014, Michael Angstadt
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met: 

 1. Redistributions of source code must retain the above copyright notice, this
 list of conditions and the following disclaimer. 
 2. Redistributions in binary form must reproduce the above copyright notice,
 this list of conditions and the following disclaimer in the documentation
 and/or other materials provided with the distribution. 

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * <p>
 * This property has different meanings depending on the component it belongs
 * to:
 * <ul>
 * <li>{@link VEvent} - The organizer of the event.</li>
 * <li>{@link VTodo} - The creator of the to-do task.</li>
 * <li>{@link VJournal} - The owner of the journal entry.</li>
 * <li>{@link VFreeBusy} - The person requesting the free/busy time.</li>
 * </ul>
 * </p>
 * <p>
 * <b>Code sample:</b>
 * 
 * <pre class="brush:java">
 * VEvent event = new VEvent();
 * 
 * Organizer organizer = Organizer.email(&quot;johndoe@example.com&quot;);
 * organizer.setCommonName(&quot;John Doe&quot;);
 * event.setOrganizer(organizer);
 * </pre>
 * 
 * </p>
 * @author Michael Angstadt
 * @see <a href="http://tools.ietf.org/html/rfc5545#page-111">RFC 5545
 * p.111-2</a>
 * @see <a href="http://tools.ietf.org/html/rfc2445#page-106">RFC 2445
 * p.106-7</a>
 */
public class Organizer extends ICalProperty {
	private String uri, email, name;

	/**
	 * Creates an organizer property
	 * @param name the organizer's name (e.g. "John Doe")
	 * @param email the organizer's email address (e.g. "jdoe@example.com")
	 */
	public Organizer(String name, String email) {
		this.name = name;
		this.email = email;
	}

	/**
	 * Gets the organizer's email
	 * @return the email (e.g. "jdoe@company.com")
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the organizer's email
	 * @param email the email (e.g. "jdoe@company.com")
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets a URI representing the organizer.
	 * @return the URI (e.g. "mailto:jdoe@company.com")
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * Sets a URI representing the organizer.
	 * @param uri the URI (e.g. "mailto:jdoe@company.com")
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

	@Override
	public String getSentBy() {
		return super.getSentBy();
	}

	@Override
	public void setSentBy(String sentBy) {
		super.setSentBy(sentBy);
	}

	@Override
	public String getCommonName() {
		return name;
	}

	@Override
	public void setCommonName(String commonName) {
		this.name = commonName;
	}

	@Override
	public String getDirectoryEntry() {
		return super.getDirectoryEntry();
	}

	@Override
	public void setDirectoryEntry(String directoryEntry) {
		super.setDirectoryEntry(directoryEntry);
	}

	/**
	 * Gets the language that the common name parameter is written in.
	 */
	@Override
	public String getLanguage() {
		return super.getLanguage();
	}

	/**
	 * Sets the language that the common name parameter is written in.
	 */
	@Override
	public void setLanguage(String language) {
		super.setLanguage(language);
	}
}
