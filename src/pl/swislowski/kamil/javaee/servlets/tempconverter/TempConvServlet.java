package pl.swislowski.kamil.javaee.servlets.tempconverter;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TempConvServlet
 */
@WebServlet("/TempConvServlet")
public class TempConvServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public TempConvServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("TempConvServlet.doGet()");
		String conversion = request.getParameter("conversion");
		System.out.println("#### conversion : " + conversion);
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/converter.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("TempConvServlet.doPost()");
		String conversionValue = request.getParameter("conversionValue");
		System.out.println("#### conversionValue : " + conversionValue);
		// Double celsiusResult =
		// TemperatureConverterUtils.fahrenheit(Double.valueOf(conversionValue));

		String conversionOptions = request.getParameter("conversionOptions");

		Double conversionResult = 0.0;
		switch (conversionOptions) {
		case "celsius": {
			conversionResult = TemperatureConverterUtils.celsius(Double.valueOf(conversionValue));
			break;
		}
		case "fahrenheit": {
			conversionResult = TemperatureConverterUtils.fahrenheit(Double.valueOf(conversionValue));
			break;
		}
		default: {
			System.out.println("Unknown conversion option!");
			break;
		}

		}
		System.out.println("#### conversionResult : " + conversionResult);
		
		request.setAttribute("conversionResult", conversionResult);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/converterResult.jsp");
		requestDispatcher.forward(request, response);
	}

}
