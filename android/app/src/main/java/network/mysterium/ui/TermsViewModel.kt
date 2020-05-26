/*
 * Copyright (C) 2019 The "mysteriumnetwork/mysterium-vpn-mobile" Authors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package network.mysterium.ui

import androidx.lifecycle.ViewModel
import network.mysterium.db.AppDatabase
import network.mysterium.db.Terms

class TermsViewModel(private val appDatabase: AppDatabase): ViewModel() {
    private val termsVersion = "1"

    suspend fun acceptCurrentTerms() {
        appDatabase.termsDao().delete()
        appDatabase.termsDao().insert(Terms(termsVersion))
    }

    suspend fun checkTermsAccepted(): Boolean {
        val terms = appDatabase.termsDao().get() ?: return false
        return terms.version == termsVersion
    }

    val termsText = """
<h3>MYSTERIUM NETWORK OPEN ALPHA</h3> 

<h4>This document includes:</h4>

 <li> &nbsp Terms of use for end users
 <li> &nbsp Privacy policy & no-logs pledge

<a name="TERMS-OF-USE"></a>
<h4>TERMS OF USE</h4> 

<h4>FOR END USERS</h4>

<h4>SHORT VERSION IN HUMAN LANGUAGE:</h4>

 <li> &nbsp Mysterium Network is still in its development (alpha version) stage. We will do our best to develop it further, but we cannot guarantee this.

 <li> &nbsp You cannot use or encourage or assist others to use the network in any way which violates any laws or rights of any party, including intellectual property rights. 

 <li> &nbsp Your use of the network is at your own risk. We provide it to you “as is” without any warranties. 

 <li> &nbsp You are responsible for all the content that you receive, distribute or otherwise transmit through the network. 

 <li> &nbsp You can use the network with our Mysterium software (https://github.com/mysteriumnetwork/) or any other compatible software.

 <li> &nbsp In no event will we be liable for any damages which you may incur. 

 <li> &nbsp We recommend you to read the full version bellow to get acquainted with all of the terms and conditions.

<h4>FULL VERSION:</h4>

<h5>1. ACCEPTANCE OF TERMS</h5>

These terms and conditions (the “Terms”) is a binding legal agreement between you and Netsys Inc. (“Mysterium Networks” or “we”) that governs your participation in the early open alpha testing program (the “Program”) of the Mysterium network (the “Network”). 
<p>
Your enrolment and participation in the Program and access to and use of the Network is subject to these Terms. By participating in the Program or using the Network you are fully accepting the terms, conditions and disclaimers contained in this document and all policies and guidelines that are incorporated by reference. If you do not accept these terms and conditions you must immediately stop using the  Network. You shall not enroll into the Program or use the Network in contradiction with these Terms or any applicable law or regulation of the country or territory you originate from or reside in or any applicable jurisdiction (the “Applicable Law”). For the purposes of these Terms, the term “using the Network” means accessing, connecting to or utilizing the Network in any other way.
<p>
You may not sign up for and participate in the Program (a) if you have not reached the age of majority in your territory of residence (in most cases, 18 to 21) or if you do not have the ability to form binding contracts under the Applicable law or (b) if you are not the owner of the device on which you use the Network. 

<h5>2. CHANGED TERMS</h5>

We shall have the right at any time to change or modify the Terms or any part thereof, or to impose new conditions, including, but not limited to, adding fees and charges for use. Such changes, modifications, additions or deletions shall be effective immediately upon notice thereof, which may be given by means including, but not limited to, posting on our website, or by electronic or conventional mail, or by any other means by which you obtain notice thereof. Any use of the Network after such notice shall be deemed to constitute acceptance of such changes, modifications or additions. 

<h5>3. DESCRIPTION OF NETWORK</h5>

The Network allows you to enhance your security and increase privacy while using the internet. We accomplish this by creating virtual tunnels through one or more connections to other users of the Network (the “Nodes”) and by using their equipment and resources to route you to your final destination.
<p>
The Network is not designed or intended to circumvent any access control or security measures and should not be used for such purposes.

<h5>4. OPEN ALPHA AND FEEDBACK</h5>

The Network is still in its early development stage. The sole purpose of the Program is to obtain feedback on the performance of the Network and to identify its defects. You expressly acknowledge that the Network is a test product and may contain bugs, errors and other problems that could cause loss of data store in the platform, inconsistent performance and other failures including but not limited to systems crashes, interruptions and data loss. You are advised to use caution and not to rely in any way on the performance and functioning of the Network. The Network is made available to you free of charge and no warranty shall be provided for the Network.
<p>
We do not guarantee that the Network will be developed to reach any subsequent development stage (e.g. release version) or that any subsequent versions will have the same or similar functionality and characteristics to the ones that the Network have. 
<p>
To maintain and develop the Network we may collect limited and anonymized information and performance data.

<h5>5. EQUIPMENT</h5>

You shall be responsible for obtaining and maintaining all hardware, software and other equipment needed for access to and use of the Network and all charges related thereto. Should you need any licenses, equipment or software to access and/or use the resources or services which are made conditional upon prior authorization, you shall be solely responsible for obtaining and maintaining such licenses, equipment and software.
<p>
As an option, you can use Mysterium software (https://github.com/mysteriumnetwork/) to use the Network.

<h5>6. RESTRICTED CONDUCT</h5>

We do not encourage, support and contribute to illegal activities and we are resolved to keep the Network operating legally.  
<p>
You shall use the Network for any purpose that is unlawful or prohibited by these Terms or any Applicable Law. 
<p>
You shall not request, receive, post, upload, download, display, distribute, transmit or make available through the Network (“Communicate”) any information and material which violates or infringes in any way upon the rights of others, which is unlawful, threatening, abusive, defamatory, invasive of privacy or publicity rights, which encourages conduct that would constitute a criminal offense, give rise to civil liability or otherwise violate the Applicable Law. 
<p>
You may not use or encourage or assist others to use the Network in any manner that could damage, disable, overburden, or impair the servers and other resources of Network or of the Nodes, or interfere with any third party’s use of the Network. You may not attempt to gain unauthorized access to any aspect of the Network or to information for which you have not been granted access.
<p>
Without limiting the generality of the foregoing, you shall not use or to encourage, authorize or assist others to use the Network for:
<pre>
 - uploading, transmitting, streaming, accessing, receiving, or distributing any copyrighted, trademark, or patented content which you do not own or lack written consent or a license from the owner;

 - accessing or using any resources or services (e.g. web pages, television or radio broadcastings, cable or satellite services, streaming media services, VOD services, etc.) which are made conditional upon prior authorization which you do not have;

 - circumventing any access control, technical protection or security measures; 

 - extortion, blackmail, kidnapping, rape, murder, sale/purchase of stolen credit cards, sale/purchase of stolen sale/purchase, sale/purchase of illegal sale/purchase, performance of identity theft;

 - use of stolen credit cards, credit card fraud, wire fraud, 

 - hacking, pharming, phishing, or spamming of any form through our service in any form or scale;

 - exploitation of or contribution to children exploitation photographically, digitally or in any other way;

 - assaulting in any way or form any other network or computer while using the Network;

 - connecting to the Network any devices, software and/or hardware which does or may do any of the above;

 - any other activities that are against the Applicable Law, and/or any other activities that are not compatible with the principles of democracy, freedom of speech, freedom of expression, and human rights.
</pre>

<h5>7. YOUR ID AND SECURITY</h5>

An ID and a private key (jointly, the “ID Data”) will be automatically created for your when you use the Network for the first time. You are entirely responsible for maintaining the confidentiality of your ID Data. Furthermore, you are entirely responsible for any activities that occur under your ID Data. You agree to notify us immediately of any unauthorized use of your account or any other breach of security. We will not be liable for any loss that you may incur as a result of someone else using your ID Data, either with or without your knowledge. However, you could be held liable for losses incurred by us or another party due to someone else using your account. You may not use anyone else's ID Data at any time, without the permission of the account holder. 

<h5>8. COPYRIGHT NOTICE</h5> 

Our logos are our trademarks. All rights reserved. All other trademarks appearing on the Network are the property of their respective owners. 

<h5>9. DISCLAIMER OF WARRANTY; LIMITATION OF LIABILITY</h5>

YOU EXPRESSLY AGREE THAT USE OF THE NETWORK IS AT YOUR SOLE RISK. NEITHER WE, OUR AFFILIATES NOR ANY OF THEIR RESPECTIVE EMPLOYEES, AGENTS, THIRD PARTY CONTENT PROVIDERS OR LICENSORS WARRANT THAT THE NETWORK WILL BE UNINTERRUPTED OR ERROR FREE; NOR DO THEY MAKE ANY WARRANTY AS TO THE RESULTS THAT MAY BE OBTAINED FROM USE OF THE NETWORK, OR AS TO THE ACCURACY, RELIABILITY OR CONTENT OF ANY INFORMATION, SERVICE, OR MERCHANDISE PROVIDED THROUGH THE NETWORK. 
<p>
THE NETWORK IS PROVIDED ON AN "AS IS" BASIS WITHOUT WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, WARRANTIES OF TITLE OR IMPLIED WARRANTIES OF MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE, OTHER THAN THOSE WARRANTIES WHICH ARE IMPLIED BY AND INCAPABLE OF EXCLUSION, RESTRICTION OR MODIFICATION UNDER THE LAWS APPLICABLE TO THIS AGREEMENT. 
<p>
THIS DISCLAIMER OF LIABILITY APPLIES TO ANY DAMAGES OR INJURY CAUSED BY ANY FAILURE OF PERFORMANCE, ERROR, OMISSION, INTERRUPTION, DELETION, DEFECT, DELAY IN OPERATION OR TRANSMISSION, COMPUTER VIRUS, COMMUNICATION LINE FAILURE, THEFT OR DESTRUCTION OR UNAUTHORIZED ACCESS TO, ALTERATION OF, OR USE OF RECORD, WHETHER FOR BREACH OF CONTRACT, TORTIOUS BEHAVIOR, NEGLIGENCE, OR UNDER ANY OTHER CAUSE OF ACTION. YOU SPECIFICALLY ACKNOWLEDGE THAT WE IS NOT LIABLE FOR THE DEFAMATORY, OFFENSIVE OR ILLEGAL CONDUCT OF OTHER USERS OR THIRD-PARTIES AND THAT THE RISK OF INJURY FROM THE FOREGOING RESTS ENTIRELY WITH YOU. 
<p>
IN NO EVENT WILL WE, OR ANY PERSON OR ENTITY INVOLVED IN CREATING, DEVELOPING OR MAINTAINING THE NETWORK, BE LIABLE FOR ANY DAMAGES, INCLUDING, WITHOUT LIMITATION, DIRECT, INDIRECT, INCIDENTAL, SPECIAL, CONSEQUENTIAL OR PUNITIVE DAMAGES ARISING OUT OF THE USE OF OR INABILITY TO USE THE NETWORK. 
<p>
IN ADDITION TO THE TERMS SET FORTH ABOVE NEITHER, WE, NOR OUR AFFILIATES OR CONTENT PARTNERS SHALL BE LIABLE REGARDLESS OF THE CAUSE OR DURATION, FOR ANY ERRORS, INACCURACIES, OMISSIONS, OR OTHER DEFECTS IN, OR UNTIMELINESS OR UNAUTHENTICITY OF, THE INFORMATION CONTAINED WITHIN THE NETWORK, OR FOR ANY DELAY OR INTERRUPTION IN THE TRANSMISSION THEREOF TO YOU, OR FOR ANY CLAIMS OR LOSSES ARISING THEREFROM OR OCCASIONED THEREBY. NONE OF THE FOREGOING PARTIES SHALL BE LIABLE FOR ANY THIRD-PARTY CLAIMS OR LOSSES OF ANY NATURE, INCLUDING, BUT NOT LIMITED TO, LOST PROFITS, PUNITIVE OR CONSEQUENTIAL DAMAGES. 
<p>
FORCE MAJEURE. NEITHER PARTY WILL BE RESPONSIBLE FOR ANY FAILURE OR DELAY IN PERFORMANCE DUE TO CIRCUMSTANCES BEYOND ITS REASONABLE CONTROL, INCLUDING, WITHOUT LIMITATION, ACTS OF GOD, WAR, RIOT, EMBARGOES, ACTS OF CIVIL OR MILITARY AUTHORITIES, FIRE, FLOODS, ACCIDENTS, SERVICE OUTAGES RESULTING FROM EQUIPMENT AND/OR SOFTWARE FAILURE AND/OR TELECOMMUNICATIONS FAILURES, POWER FAILURES, NETWORK FAILURES, FAILURES OF THIRD PARTY SERVICE PROVIDERS (INCLUDING PROVIDERS OF INTERNET SERVICES AND TELECOMMUNICATIONS). THE PARTY AFFECTED BY ANY SUCH EVENT SHALL NOTIFY THE OTHER PARTY WITHIN A MAXIMUM OF FIFTEEN (15) DAYS FROM ITS OCCURENCE. THE PERFORMANCE OF THS AGREEMENT SHALL THEN BE SUSPENDED FOR AS LONG AS ANY SUCH EVENT SHALL PREVENT THE AFFECTED PARTY FROM PERFORMING ITS OBLIGATIONS UNDER THIS AGREEMENT. 

<h5>10. INDEMNIFICATION</h5>

You agree to defend, indemnify and hold harmless us, our affiliates and their respective directors, officers, employees and agents from and against all loss, claim, damage, expense or liability (including all reasonable attorneys’ fees and other expenses reasonably incurred in investigating, preparing or defending against litigation, commenced or threatened), incurred by the aggrieved party as a result of, or arising out of, or relating to (a) any misrepresentation or breach of any representation or warranty made by you, (b) any breach of these Terms by you, (c) your violation of the Applicable Law or any rights of another, including any intellectual property rights, or (c) any cause of action, suit or claim brought or made against us and arising out of or resulting from your use of the Network. 

<h5>11. TERMINATION</h5>

You may terminate the Terms at any time by ceasing your use of the Network and closing your account with us. 
<p>
We may terminate these Terms at any time for any reason whatsoever, including without limitation if you breach the Terms or the Applicable Law. 
<p>
Upon termination we may delete your data which is under our control. 

<h5>12. MISCELLANEOUS</h5>

You agree to comply with all applicable export laws and restrictions and regulations and agree that you will not export, or allow the export or re-export of the Network or any part of it in violation of the Applicable Law.
<p>
The Terms constitute the entire agreement of the parties with respect to the subject matter hereof, and supersede all previous written or oral agreements between the parties with respect to such subject matter. This Agreement shall be construed in accordance with the laws of the Republic of Panama without regard to its conflict of laws rules. 
<p>
You agree that any legal action arising out of or relating to these Terms shall be filed exclusively in the competent courts of the Republic of Panama.
<p>
No waiver by either party of any breach or default hereunder shall be deemed to be a waiver of any preceding or subsequent breach or default. The section headings used herein are for convenience only and shall not be given any legal importance. 
<p>
You agree that these Terms and our rights hereunder may be assigned, in whole or in part, by us or our affiliate to any third party, at our sole discretion, including an assignment in connection with a merger, acquisition, reorganization or sale of substantially all of our assets, or otherwise, in whole or in part. You may not delegate, sublicense or assign your rights under these Terms.

<h4>PRIVACY POLICY & NO-LOGS PLEDGE</h4>
Effective date: May 22, 2020
<p>
Netsys Inc. ("us", "we", or "our") operates the Mysterium network (the “Network”). 
<p>
This privacy policy (the “Privacy Policy”) informs you of our policies regarding the collection, use and disclosure of data when you use the Network and the choices you have associated with that data. This Privacy Policy applies only if and to the extent we process the data in relation to the Network. 
<p>
This Privacy Policy supplements our <a href="#TERMS-OF-USE">Terms of Use</a> (“ToU”) and is an integral part of it. If any provisions of the Privacy Policy and the ToU cannot be read in any manner other than a one that produces an irreconcilable conflict between them, the provisions of this Privacy Policy shall prevail. Unless otherwise defined in this Privacy Policy, the terms used in this Privacy Policy have the same meanings as in our ToU.

<h5>A. NO-LOGS PLEDGE</h5>   

We will not collect any information or store any logs about your browsing activity, queries, data destinations, IP addresses or timestamps. We are based in a jurisdiction (Panama) which laws do not require us to retain any of such data. The only information we collect in connection to your use of the Network is the information listed in this Privacy Policy below.
<p>
Additionally, as we provide the Network by creating virtual tunnels through one or more connections to other users of the Network (i.e. the Nodes, as defined in the ToU) and by using their equipment and resources to route you to your destination, it is not technically possible for us monitor your activities in the Network.
<p>
In addition to our no-logs pledge this creates an additional layer of privacy for you.
<p>
Having said this we feel that it is our obligation to inform you that the Network cannot guarantee 100% privacy. We enter into binding legal agreements with our users who run the nodes in the Network to prevent them from logging and storing the traffic which passes their nodes, but we cannot promise they will not.
<p>
If the applicable law requires us to disclose your data, we will be forced to do so; however, as we collect and store just minimal data which does not allow to identify you (see below), the impact of such disclosure on your privacy will be minimal.

<h5>B. ANONYMOUS DATA</h5>

To use the Network you need to create a public / private key pair. Your public key will be passed to us to register you with the Network. Note, that this public key will not include any of your personal data and you cannot be identified by it. 
<p>
When you use the Network we may collect minimal information on how the Network is used and whether the connection was successful. However, this information is anonymous and cannot identify you and we use it to develop and maintain the Network.

<h5>C. CHANGES TO THE PRIVACY POLICY</h5>

We may update our Privacy Policy from time to time. Such changes, modifications, additions or deletions shall be effective immediately upon notice thereof, which may be given by means including, but not limited to, posting on our website, or by electronic or conventional mail, or by any other means by which you obtain notice thereof. Any use of the Network after such notice shall be deemed to constitute acceptance of such changes, modifications or additions. 

<h5>D. CONTACT US</h5>

 If you have any questions about this Privacy Policy, please contact us by email: support@netsys.technology

    """.trimIndent()
}