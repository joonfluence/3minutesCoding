$(document).ready(function () {
  $("#send-button").click(function () {
    var question = $("#input-question").val();
    addMessage(question, "sent");

    // Simulate server response (replace with actual server communication)
    var serverResponse = "This is the answer to your question.";
    setTimeout(function () {
      addMessage(serverResponse, "received");
    }, 500);
  });
});

function addMessage(text, className) {
  var messageContainer = $("<div>").addClass("message").addClass(className);
  var message = $("<p>").text(text);
  messageContainer.append(message);
  $("#chat-body").append(messageContainer);
}
